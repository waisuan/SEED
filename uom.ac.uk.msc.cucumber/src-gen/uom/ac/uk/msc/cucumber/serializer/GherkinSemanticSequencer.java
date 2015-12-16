/*
 * generated by Xtext
 */
package uom.ac.uk.msc.cucumber.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uom.ac.uk.msc.cucumber.gherkin.Background;
import uom.ac.uk.msc.cucumber.gherkin.DocString;
import uom.ac.uk.msc.cucumber.gherkin.Examples;
import uom.ac.uk.msc.cucumber.gherkin.Feature;
import uom.ac.uk.msc.cucumber.gherkin.GherkinPackage;
import uom.ac.uk.msc.cucumber.gherkin.Scenario;
import uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline;
import uom.ac.uk.msc.cucumber.gherkin.Step;
import uom.ac.uk.msc.cucumber.gherkin.Table;
import uom.ac.uk.msc.cucumber.gherkin.Tag;
import uom.ac.uk.msc.cucumber.services.GherkinGrammarAccess;

@SuppressWarnings("all")
public class GherkinSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GherkinGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GherkinPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GherkinPackage.BACKGROUND:
				sequence_Background(context, (Background) semanticObject); 
				return; 
			case GherkinPackage.DOC_STRING:
				sequence_DocString(context, (DocString) semanticObject); 
				return; 
			case GherkinPackage.EXAMPLES:
				sequence_Examples(context, (Examples) semanticObject); 
				return; 
			case GherkinPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case GherkinPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case GherkinPackage.SCENARIO_OUTLINE:
				sequence_ScenarioOutline(context, (ScenarioOutline) semanticObject); 
				return; 
			case GherkinPackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			case GherkinPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			case GherkinPackage.TAG:
				sequence_Tag(context, (Tag) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (backgroundKeyword=BackgroundKeyword title=Title? narrative=Narrative? steps+=Step+)
	 */
	protected void sequence_Background(EObject context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content=DOC_STRING
	 */
	protected void sequence_DocString(EObject context, DocString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.DOC_STRING__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.DOC_STRING__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDocStringAccess().getContentDOC_STRINGTerminalRuleCall_0_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=Title? narrative=Narrative? table=Table)
	 */
	protected void sequence_Examples(EObject context, Examples semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=Tag* title=Title narrative=Narrative? background=Background? (scenarios+=Scenario | scenarios+=ScenarioOutline)+)
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=Tag* title=Title narrative=Narrative? steps+=Step+ examples=Examples)
	 */
	protected void sequence_ScenarioOutline(EObject context, ScenarioOutline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=Tag* title=Title narrative=Narrative? steps+=Step+)
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stepKeyword=StepKeyword description=StepDescription tables+=Table* code=DocString? tables+=Table*)
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     rows+=TABLE_ROW+
	 */
	protected void sequence_Table(EObject context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=TAGNAME
	 */
	protected void sequence_Tag(EObject context, Tag semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.TAG__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.TAG__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTagAccess().getIdTAGNAMETerminalRuleCall_0_0(), semanticObject.getId());
		feeder.finish();
	}
}
