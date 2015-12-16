/**
 * generated by Xtext
 */
package uom.ac.uk.msc.cucumber.ui.quickfix;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uom.ac.uk.msc.cucumber.gherkin.Background;
import uom.ac.uk.msc.cucumber.gherkin.Examples;
import uom.ac.uk.msc.cucumber.gherkin.Feature;
import uom.ac.uk.msc.cucumber.gherkin.Scenario;
import uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline;
import uom.ac.uk.msc.cucumber.gherkin.Step;
import uom.ac.uk.msc.cucumber.gherkin.Table;
import uom.ac.uk.msc.cucumber.gherkin.impl.GherkinFactoryImpl;
import uom.ac.uk.msc.cucumber.validation.GherkinValidator;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
@SuppressWarnings("all")
public class GherkinQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(GherkinValidator.STEP_REPEATED_IN_EVERY_SCENARIO)
  public void moveStepsIntoBackground(final Issue issue, final IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, "Put step(s) into background.", "", null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          String[] _data = issue.getData();
          String _get = _data[2];
          Integer _valueOf = Integer.valueOf(_get);
          int numOfScenarios = ((int) (_valueOf).intValue());
          String[] _data_1 = issue.getData();
          int _size = ((List<String>)Conversions.doWrapArray(_data_1)).size();
          int _minus = (_size - 3);
          int numOfSteps = (_minus / numOfScenarios);
          int counter = ((int) 3);
          int numOfLinesReplaced = ((int) 0);
          String builder = ((String) "");
          LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>();
          Set<String> uniqueBackgroundSteps = ((Set<String>) _linkedHashSet);
          while ((counter < ((List<String>)Conversions.doWrapArray(issue.getData())).size())) {
            {
              String[] _data_2 = issue.getData();
              String _get_1 = _data_2[counter];
              String[] lineNumAndLength = _get_1.split(" ");
              String _get_2 = lineNumAndLength[0];
              int lineNumber = (Integer.valueOf(_get_2)).intValue();
              String _get_3 = lineNumAndLength[1];
              int numOfLines = (Integer.valueOf(_get_3)).intValue();
              String _get_4 = lineNumAndLength[2];
              int lineLength = (Integer.valueOf(_get_4)).intValue();
              int _lineNumber = lineNumber;
              lineNumber = (_lineNumber - numOfLinesReplaced);
              if ((numOfSteps > 0)) {
                int _lineOffset = xtextDocument.getLineOffset((lineNumber - 1));
                String _get_5 = xtextDocument.get(_lineOffset, lineLength);
                uniqueBackgroundSteps.add(_get_5);
                int _numOfSteps = numOfSteps;
                numOfSteps = (_numOfSteps - 1);
              }
              int _lineOffset_1 = xtextDocument.getLineOffset((lineNumber - 1));
              xtextDocument.replace(_lineOffset_1, lineLength, "");
              int _counter = counter;
              counter = (_counter + 1);
              int _numOfLinesReplaced = numOfLinesReplaced;
              numOfLinesReplaced = (_numOfLinesReplaced + numOfLines);
            }
          }
          for (final String uniqueBackgroundStep : uniqueBackgroundSteps) {
            String _builder = builder;
            builder = (_builder + uniqueBackgroundStep);
          }
          String[] _data_2 = issue.getData();
          String _get_1 = _data_2[0];
          boolean _equals = _get_1.equals("");
          boolean _not = (!_equals);
          if (_not) {
            String[] _data_3 = issue.getData();
            String _get_2 = _data_3[0];
            int backgroundEndLine = (Integer.valueOf(_get_2)).intValue();
            int _lineOffset = xtextDocument.getLineOffset(backgroundEndLine);
            xtextDocument.replace(_lineOffset, 0, builder);
          } else {
            String[] _data_4 = issue.getData();
            String _get_3 = _data_4[1];
            int firstScenarioOffset = (Integer.valueOf(_get_3)).intValue();
            String _lineSeparator = System.lineSeparator();
            String _plus = ("Background:" + _lineSeparator);
            String _plus_1 = (_plus + builder);
            String _lineSeparator_1 = System.lineSeparator();
            String _plus_2 = (_plus_1 + _lineSeparator_1);
            xtextDocument.replace(firstScenarioOffset, 0, _plus_2);
          }
        }
      });
  }
  
  @Fix(GherkinValidator.CONSECUTIVE_STEPS)
  public void changeStepKeywordsIntoAndBut(final Issue issue, final IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, 
      "Change into a \"And\" step", 
      "", 
      null, 
      new IModification() {
        @Override
        public void apply(final IModificationContext context) throws Exception {
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          int deductions = ((int) 0);
          String[] _data = issue.getData();
          for (final String offsets : _data) {
            {
              String[] tokens = offsets.split(" ");
              String _get = tokens[0];
              Integer _valueOf = Integer.valueOf(_get);
              int _plus = ((_valueOf).intValue() + deductions);
              String _get_1 = tokens[1];
              Integer _valueOf_1 = Integer.valueOf(_get_1);
              xtextDocument.replace(_plus, (_valueOf_1).intValue(), "And");
              int _deductions = deductions;
              String _get_2 = tokens[1];
              Integer _valueOf_2 = Integer.valueOf(_get_2);
              int _minus = ((_valueOf_2).intValue() - 3);
              deductions = (_deductions - _minus);
            }
          }
        }
      });
    acceptor.accept(issue, 
      "Change into a \"But\" step", 
      "", 
      null, 
      new IModification() {
        @Override
        public void apply(final IModificationContext context) throws Exception {
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          int deductions = ((int) 0);
          String[] _data = issue.getData();
          for (final String offsets : _data) {
            {
              String[] tokens = offsets.split(" ");
              String _get = tokens[0];
              Integer _valueOf = Integer.valueOf(_get);
              int _plus = ((_valueOf).intValue() + deductions);
              String _get_1 = tokens[1];
              Integer _valueOf_1 = Integer.valueOf(_get_1);
              xtextDocument.replace(_plus, (_valueOf_1).intValue(), "But");
              int _deductions = deductions;
              String _get_2 = tokens[1];
              Integer _valueOf_2 = Integer.valueOf(_get_2);
              int _minus = ((_valueOf_2).intValue() - 3);
              deductions = (_deductions - _minus);
            }
          }
        }
      });
  }
  
  @Fix(GherkinValidator.SEPARATE_TO_AND_STEPS)
  public void splitStepIntoAndSteps(final Issue issue, final IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, 
      "Split step into \"And\" steps", 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          Step step = ((Step) element);
          List<Step> listOfSteps = new ArrayList<Step>();
          EObject _eContainer = step.eContainer();
          if ((_eContainer instanceof Scenario)) {
            EObject _eContainer_1 = step.eContainer();
            Scenario scenario = ((Scenario) _eContainer_1);
            EList<Step> _steps = scenario.getSteps();
            listOfSteps = _steps;
          } else {
            EObject _eContainer_2 = step.eContainer();
            if ((_eContainer_2 instanceof ScenarioOutline)) {
              EObject _eContainer_3 = step.eContainer();
              ScenarioOutline scenarioOutline = ((ScenarioOutline) _eContainer_3);
              EList<Step> _steps_1 = scenarioOutline.getSteps();
              listOfSteps = _steps_1;
            } else {
              EObject _eContainer_4 = step.eContainer();
              if ((_eContainer_4 instanceof Background)) {
                EObject _eContainer_5 = step.eContainer();
                Background background = ((Background) _eContainer_5);
                EList<Step> _steps_2 = background.getSteps();
                listOfSteps = _steps_2;
              }
            }
          }
          int numOfSteps = listOfSteps.size();
          boolean switchLater = false;
          int originIndex = listOfSteps.indexOf(step);
          int nextIndex = (originIndex + 1);
          if ((nextIndex >= numOfSteps)) {
            nextIndex = originIndex;
            switchLater = true;
          }
          String[] _data = issue.getData();
          String _get = _data[0];
          step.setDescription(_get);
          int counter = 1;
          while ((counter < ((List<String>)Conversions.doWrapArray(issue.getData())).size())) {
            {
              Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
              newStep.setStepKeyword(("\t" + "And "));
              String[] _data_1 = issue.getData();
              String _get_1 = _data_1[counter];
              String _lineSeparator = System.lineSeparator();
              String _plus = (_get_1 + _lineSeparator);
              newStep.setDescription(_plus);
              int _plusPlus = nextIndex++;
              listOfSteps.add(_plusPlus, newStep);
              int _counter = counter;
              counter = (_counter + 1);
            }
          }
          boolean _and = false;
          if (!(!switchLater)) {
            _and = false;
          } else {
            int _size = listOfSteps.size();
            boolean _lessThan = (nextIndex < _size);
            _and = _lessThan;
          }
          if (_and) {
            Step _get_1 = listOfSteps.get(nextIndex);
            String keyword = _get_1.getStepKeyword();
            Step _get_2 = listOfSteps.get(nextIndex);
            _get_2.setStepKeyword(("\t" + keyword));
          }
          if (switchLater) {
            Step firstStep = listOfSteps.get(originIndex);
            int _size_1 = listOfSteps.size();
            int _minus = (_size_1 - 1);
            Step lastStep = listOfSteps.get(_minus);
            int _size_2 = listOfSteps.size();
            int _minus_1 = (_size_2 - 2);
            Step secondLastStep = listOfSteps.get(_minus_1);
            String firstStepKeyword = firstStep.getStepKeyword();
            String lastStepKeyword = lastStep.getStepKeyword();
            String firstStepDescription = firstStep.getDescription();
            String lastStepDescription = lastStep.getDescription();
            String secondLastStepDescription = secondLastStep.getDescription();
            firstStep.setStepKeyword(lastStepKeyword);
            lastStep.setStepKeyword(firstStepKeyword);
            lastStep.setDescription(" ");
            String _lineSeparator = System.lineSeparator();
            String _plus = (lastStepDescription + _lineSeparator);
            firstStep.setDescription(_plus);
            lastStep.setDescription(firstStepDescription);
            boolean _notEquals = (!Objects.equal(secondLastStep, firstStep));
            if (_notEquals) {
              Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
              String _stepKeyword = lastStep.getStepKeyword();
              newStep.setStepKeyword(_stepKeyword);
              String _description = lastStep.getDescription();
              newStep.setDescription(_description);
              lastStep.setDescription(" ");
              listOfSteps.add((originIndex + 1), newStep);
              listOfSteps.remove(lastStep);
              String _lineSeparator_1 = System.lineSeparator();
              String _plus_1 = (secondLastStepDescription + _lineSeparator_1);
              secondLastStep.setDescription(_plus_1);
            } else {
              firstStep.setStepKeyword(("\t" + lastStepKeyword));
              String _trim = firstStepDescription.trim();
              lastStep.setDescription(_trim);
            }
          }
        }
      });
  }
  
  @Fix(GherkinValidator.SEPARATE_TO_BUT_STEPS)
  public void splitStepIntoButSteps(final Issue issue, final IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, 
      "Split step into \"But\" steps", 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          Step step = ((Step) element);
          List<Step> listOfSteps = new ArrayList<Step>();
          EObject _eContainer = step.eContainer();
          if ((_eContainer instanceof Scenario)) {
            EObject _eContainer_1 = step.eContainer();
            Scenario scenario = ((Scenario) _eContainer_1);
            EList<Step> _steps = scenario.getSteps();
            listOfSteps = _steps;
          } else {
            EObject _eContainer_2 = step.eContainer();
            if ((_eContainer_2 instanceof ScenarioOutline)) {
              EObject _eContainer_3 = step.eContainer();
              ScenarioOutline scenarioOutline = ((ScenarioOutline) _eContainer_3);
              EList<Step> _steps_1 = scenarioOutline.getSteps();
              listOfSteps = _steps_1;
            } else {
              EObject _eContainer_4 = step.eContainer();
              if ((_eContainer_4 instanceof Background)) {
                EObject _eContainer_5 = step.eContainer();
                Background background = ((Background) _eContainer_5);
                EList<Step> _steps_2 = background.getSteps();
                listOfSteps = _steps_2;
              }
            }
          }
          int numOfSteps = listOfSteps.size();
          boolean switchLater = false;
          int originIndex = listOfSteps.indexOf(step);
          int nextIndex = (originIndex + 1);
          if ((nextIndex >= numOfSteps)) {
            nextIndex = originIndex;
            switchLater = true;
          }
          String[] _data = issue.getData();
          String _get = _data[0];
          step.setDescription(_get);
          int counter = 1;
          while ((counter < ((List<String>)Conversions.doWrapArray(issue.getData())).size())) {
            {
              Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
              newStep.setStepKeyword(("\t" + "But "));
              String[] _data_1 = issue.getData();
              String _get_1 = _data_1[counter];
              String _lineSeparator = System.lineSeparator();
              String _plus = (_get_1 + _lineSeparator);
              newStep.setDescription(_plus);
              int _plusPlus = nextIndex++;
              listOfSteps.add(_plusPlus, newStep);
              int _counter = counter;
              counter = (_counter + 1);
            }
          }
          boolean _and = false;
          if (!(!switchLater)) {
            _and = false;
          } else {
            int _size = listOfSteps.size();
            boolean _lessThan = (nextIndex < _size);
            _and = _lessThan;
          }
          if (_and) {
            Step _get_1 = listOfSteps.get(nextIndex);
            String keyword = _get_1.getStepKeyword();
            Step _get_2 = listOfSteps.get(nextIndex);
            _get_2.setStepKeyword(("\t" + keyword));
          }
          if (switchLater) {
            Step firstStep = listOfSteps.get(originIndex);
            int _size_1 = listOfSteps.size();
            int _minus = (_size_1 - 1);
            Step lastStep = listOfSteps.get(_minus);
            int _size_2 = listOfSteps.size();
            int _minus_1 = (_size_2 - 2);
            Step secondLastStep = listOfSteps.get(_minus_1);
            String firstStepKeyword = firstStep.getStepKeyword();
            String lastStepKeyword = lastStep.getStepKeyword();
            String firstStepDescription = firstStep.getDescription();
            String lastStepDescription = lastStep.getDescription();
            String secondLastStepDescription = secondLastStep.getDescription();
            firstStep.setStepKeyword(lastStepKeyword);
            lastStep.setStepKeyword(firstStepKeyword);
            lastStep.setDescription(" ");
            String _lineSeparator = System.lineSeparator();
            String _plus = (lastStepDescription + _lineSeparator);
            firstStep.setDescription(_plus);
            lastStep.setDescription(firstStepDescription);
            boolean _notEquals = (!Objects.equal(secondLastStep, firstStep));
            if (_notEquals) {
              Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
              String _stepKeyword = lastStep.getStepKeyword();
              newStep.setStepKeyword(_stepKeyword);
              String _description = lastStep.getDescription();
              newStep.setDescription(_description);
              lastStep.setDescription(" ");
              listOfSteps.add((originIndex + 1), newStep);
              listOfSteps.remove(lastStep);
              String _lineSeparator_1 = System.lineSeparator();
              String _plus_1 = (secondLastStepDescription + _lineSeparator_1);
              secondLastStep.setDescription(_plus_1);
            } else {
              firstStep.setStepKeyword(("\t" + lastStepKeyword));
              String _trim = firstStepDescription.trim();
              lastStep.setDescription(_trim);
            }
          }
        }
      });
  }
  
  @Fix(GherkinValidator.SIMILAR_SCENARIOS)
  public void changeScenariosIntoScenarioOutline(final Issue issue, final IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, 
      "Convert scenario(s) into a Scenario Outline", 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          Scenario scenario = ((Scenario) element);
          EObject _eContainer = scenario.eContainer();
          Feature feature = ((Feature) _eContainer);
          String[] _data = issue.getData();
          String _get = _data[0];
          int numOfScenarios = (Integer.valueOf(_get)).intValue();
          for (int i = numOfScenarios; (i >= 1); i--) {
            {
              EList<EObject> _scenarios = feature.getScenarios();
              String[] _data_1 = issue.getData();
              String _get_1 = _data_1[i];
              Integer _valueOf = Integer.valueOf(_get_1);
              EObject _get_2 = _scenarios.get((_valueOf).intValue());
              Scenario toBeRemoved = ((Scenario) _get_2);
              EList<EObject> _scenarios_1 = feature.getScenarios();
              _scenarios_1.remove(toBeRemoved);
            }
          }
          String[] _data_1 = issue.getData();
          String scenarioOutlineTitle = _data_1[(numOfScenarios + 1)];
          ScenarioOutline scenarioOutline = GherkinFactoryImpl.eINSTANCE.createScenarioOutline();
          String _lineSeparator = System.lineSeparator();
          String _plus = (scenarioOutlineTitle + _lineSeparator);
          scenarioOutline.setTitle(_plus);
          EList<EObject> _scenarios = feature.getScenarios();
          _scenarios.add(scenarioOutline);
          String[] _data_2 = issue.getData();
          String _get_1 = _data_2[(numOfScenarios + 2)];
          int numOfSteps = (Integer.valueOf(_get_1)).intValue();
          int start = (Integer.valueOf((numOfScenarios + 3))).intValue();
          for (int i = 0; (i < numOfSteps); i++) {
            {
              Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
              String[] _data_3 = issue.getData();
              int _plusPlus = start++;
              String _get_2 = _data_3[_plusPlus];
              newStep.setStepKeyword(_get_2);
              String[] _data_4 = issue.getData();
              int _plusPlus_1 = start++;
              String _get_3 = _data_4[_plusPlus_1];
              String _lineSeparator_1 = System.lineSeparator();
              String _plus_1 = (_get_3 + _lineSeparator_1);
              newStep.setDescription(_plus_1);
              EList<Step> _steps = scenarioOutline.getSteps();
              _steps.add(newStep);
            }
          }
          Examples example = GherkinFactoryImpl.eINSTANCE.createExamples();
          String _lineSeparator_1 = System.lineSeparator();
          example.setTitle(_lineSeparator_1);
          Table table = GherkinFactoryImpl.eINSTANCE.createTable();
          EList<String> _rows = table.getRows();
          String[] _data_3 = issue.getData();
          int _plusPlus = start++;
          String _get_2 = _data_3[_plusPlus];
          String _lineSeparator_2 = System.lineSeparator();
          String _plus_1 = (_get_2 + _lineSeparator_2);
          _rows.add(_plus_1);
          for (int i = start; (i < ((List<String>)Conversions.doWrapArray(issue.getData())).size()); i++) {
            EList<String> _rows_1 = table.getRows();
            String[] _data_4 = issue.getData();
            String _get_3 = _data_4[i];
            String _lineSeparator_3 = System.lineSeparator();
            String _plus_2 = (_get_3 + _lineSeparator_3);
            _rows_1.add(_plus_2);
          }
          example.setTable(table);
          scenarioOutline.setExamples(example);
        }
      });
  }
  
  @Fix(GherkinValidator.SCENARIOS_HAVE_TO_BE_UNIQUE)
  public void fixDuplicateScenario(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    String _plus = ("Rename \"" + _get);
    String _plus_1 = (_plus + "\"");
    acceptor.accept(issue, _plus_1, 
      "", 
      null, 
      new IModification() {
        @Override
        public void apply(final IModificationContext context) throws Exception {
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          Integer _length = issue.getLength();
          String[] _data = issue.getData();
          String _get = _data[0];
          Integer _lineNumber = issue.getLineNumber();
          String _plus = (_get + _lineNumber);
          xtextDocument.replace((_offset).intValue(), (_length).intValue(), _plus);
        }
      });
    String[] _data_1 = issue.getData();
    String _get_1 = _data_1[0];
    String _plus_2 = ("Remove \"" + _get_1);
    String _plus_3 = (_plus_2 + "\"");
    acceptor.accept(issue, _plus_3, 
      "", 
      null, 
      new IModification() {
        @Override
        public void apply(final IModificationContext context) throws Exception {
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          Integer _length = issue.getLength();
          xtextDocument.replace((_offset).intValue(), (_length).intValue(), "");
        }
      });
  }
  
  @Fix(GherkinValidator.FEATURES_HAVE_TO_BE_UNIQUE)
  public void fixDuplicateFeature(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    String _plus = ("Rename \"" + _get);
    String _plus_1 = (_plus + "\"");
    acceptor.accept(issue, _plus_1, 
      "", 
      null, 
      new IModification() {
        @Override
        public void apply(final IModificationContext context) throws Exception {
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          Integer _length = issue.getLength();
          String[] _data = issue.getData();
          String _get = _data[0];
          Integer _lineNumber = issue.getLineNumber();
          String _plus = (_get + _lineNumber);
          xtextDocument.replace((_offset).intValue(), (_length).intValue(), _plus);
        }
      });
    String[] _data_1 = issue.getData();
    String _get_1 = _data_1[0];
    String _plus_2 = ("Remove \"" + _get_1);
    String _plus_3 = (_plus_2 + "\"");
    acceptor.accept(issue, _plus_3, 
      "", 
      null, 
      new IModification() {
        @Override
        public void apply(final IModificationContext context) throws Exception {
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          Integer _length = issue.getLength();
          xtextDocument.replace((_offset).intValue(), (_length).intValue(), "");
        }
      });
  }
  
  @Fix(GherkinValidator.DUPLICATE_STEP)
  public void fixDuplicateSteps(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[1];
    String _plus = ("Rename \"" + _get);
    String _plus_1 = (_plus + "\"");
    acceptor.accept(issue, _plus_1, 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          Step step = ((Step) element);
          String _description = step.getDescription();
          Integer _lineNumber = issue.getLineNumber();
          String _plus = (_description + _lineNumber);
          step.setDescription(_plus);
        }
      });
    String[] _data_1 = issue.getData();
    String _get_1 = _data_1[2];
    String _plus_2 = ("Remove \"" + _get_1);
    String _plus_3 = (_plus_2 + "\"");
    acceptor.accept(issue, _plus_3, 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          Step step = ((Step) element);
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          String _stepKeyword = step.getStepKeyword();
          int _length = _stepKeyword.length();
          int _minus = ((_offset).intValue() - _length);
          String[] _data = issue.getData();
          String _get = _data[2];
          int _length_1 = _get.length();
          xtextDocument.replace(_minus, _length_1, "");
        }
      });
  }
  
  @Fix(GherkinValidator.STEP_EXISTS_IN_BACKGROUND)
  public void fixStepsAlreadyExistsInBackground(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    String _plus = ("Remove \"" + _get);
    String _plus_1 = (_plus + "\"");
    acceptor.accept(issue, _plus_1, 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          Step step = ((Step) element);
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          String _stepKeyword = step.getStepKeyword();
          int _length = _stepKeyword.length();
          int _minus = ((_offset).intValue() - _length);
          String[] _data = issue.getData();
          String _get = _data[0];
          int _length_1 = _get.length();
          xtextDocument.replace(_minus, _length_1, "");
        }
      });
  }
  
  @Fix(GherkinValidator.REPEATED_EXAMPLES_TABLE_ROWS)
  public void fixRepeatedExamplesTableRows(final Issue issue, final IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue, 
      "Remove table row(s)", 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          String[] _data = issue.getData();
          String issue = _data[0];
          String[] rows = issue.split("\\s");
          final String[] _converted_rows = (String[])rows;
          IterableExtensions.<String>sort(((Iterable<String>)Conversions.doWrapArray(_converted_rows)));
          int _length = rows.length;
          int counter = (_length - 1);
          ScenarioOutline scenarioOutline = ((ScenarioOutline) element);
          Examples examples = scenarioOutline.getExamples();
          for (int index = (examples.getTable().getRows().size() - 1); (index >= 0); index--) {
            {
              boolean _and = false;
              if (!(counter >= 0)) {
                _and = false;
              } else {
                String _get = rows[counter];
                boolean _equals = _get.equals("");
                _and = _equals;
              }
              if (_and) {
                counter--;
              }
              boolean _and_1 = false;
              if (!(counter >= 0)) {
                _and_1 = false;
              } else {
                String _get_1 = rows[counter];
                Integer _valueOf = Integer.valueOf(_get_1);
                boolean _equals_1 = (index == (_valueOf).intValue());
                _and_1 = _equals_1;
              }
              if (_and_1) {
                Table _table = examples.getTable();
                EList<String> _rows = _table.getRows();
                _rows.remove(index);
                counter--;
              }
            }
          }
        }
      });
  }
  
  @Fix(GherkinValidator.SIMILAR_SCENARIO_TITLES)
  public void fixSimilarScenarioTitles(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    String _plus = ("Remove \"" + _get);
    String _plus_1 = (_plus + "\"");
    acceptor.accept(issue, _plus_1, 
      "", 
      null, 
      new IModification() {
        @Override
        public void apply(final IModificationContext context) throws Exception {
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          Integer _length = issue.getLength();
          xtextDocument.replace((_offset).intValue(), (_length).intValue(), "");
        }
      });
  }
  
  @Fix(GherkinValidator.SIMILAR_STEPS)
  public void fixSimilarSteps(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    String _plus = ("Remove \"" + _get);
    String _plus_1 = (_plus + "\"");
    acceptor.accept(issue, _plus_1, 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          Step step = ((Step) element);
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          String _stepKeyword = step.getStepKeyword();
          int _length = _stepKeyword.length();
          int _minus = ((_offset).intValue() - _length);
          String[] _data = issue.getData();
          String _get = _data[0];
          int _length_1 = _get.length();
          xtextDocument.replace(_minus, _length_1, "");
        }
      });
  }
  
  @Fix(GherkinValidator.SIMILAR_STEP_EXISTS_IN_BACKGROUND)
  public void fixSimilarStepsExistInBackground(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    String _plus = ("Remove \"" + _get);
    String _plus_1 = (_plus + "\"");
    acceptor.accept(issue, _plus_1, 
      "", 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          Step step = ((Step) element);
          IXtextDocument _xtextDocument = context.getXtextDocument();
          IXtextDocument xtextDocument = ((IXtextDocument) _xtextDocument);
          Integer _offset = issue.getOffset();
          String _stepKeyword = step.getStepKeyword();
          int _length = _stepKeyword.length();
          int _minus = ((_offset).intValue() - _length);
          String[] _data = issue.getData();
          String _get = _data[0];
          int _length_1 = _get.length();
          xtextDocument.replace(_minus, _length_1, "");
        }
      });
  }
}
