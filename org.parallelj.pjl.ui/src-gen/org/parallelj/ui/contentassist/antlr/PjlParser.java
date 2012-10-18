/*
* generated by Xtext
*/
package org.parallelj.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.parallelj.services.PjlGrammarAccess;

public class PjlParser extends AbstractContentAssistParser {
	
	@Inject
	private PjlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.parallelj.ui.contentassist.antlr.internal.InternalPjlParser createParser() {
		org.parallelj.ui.contentassist.antlr.internal.InternalPjlParser result = new org.parallelj.ui.contentassist.antlr.internal.InternalPjlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getProcedureAccess().getAlternatives(), "rule__Procedure__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getJoinTypeAccess().getAlternatives(), "rule__JoinType__Alternatives");
					put(grammarAccess.getSplitTypeAccess().getAlternatives(), "rule__SplitType__Alternatives");
					put(grammarAccess.getSpecificationAccess().getGroup(), "rule__Specification__Group__0");
					put(grammarAccess.getSpecificationAccess().getGroup_1(), "rule__Specification__Group_1__0");
					put(grammarAccess.getSpecificationAccess().getGroup_1_1(), "rule__Specification__Group_1_1__0");
					put(grammarAccess.getSpecificationAccess().getGroup_2(), "rule__Specification__Group_2__0");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_3(), "rule__Program__Group_3__0");
					put(grammarAccess.getProgramAccess().getGroup_4(), "rule__Program__Group_4__0");
					put(grammarAccess.getProgramAccess().getGroup_9(), "rule__Program__Group_9__0");
					put(grammarAccess.getProgramAccess().getGroup_9_3(), "rule__Program__Group_9_3__0");
					put(grammarAccess.getProgramAccess().getGroup_10(), "rule__Program__Group_10__0");
					put(grammarAccess.getProgramAccess().getGroup_10_1(), "rule__Program__Group_10_1__0");
					put(grammarAccess.getProgramAccess().getGroup_11(), "rule__Program__Group_11__0");
					put(grammarAccess.getProgramAccess().getGroup_11_3(), "rule__Program__Group_11_3__0");
					put(grammarAccess.getMetaInformationContainerAccess().getGroup(), "rule__MetaInformationContainer__Group__0");
					put(grammarAccess.getMetaInformationContainerAccess().getGroup_3(), "rule__MetaInformationContainer__Group_3__0");
					put(grammarAccess.getMetaInformationContainerAccess().getGroup_3_3(), "rule__MetaInformationContainer__Group_3_3__0");
					put(grammarAccess.getMetaInformationAccess().getGroup(), "rule__MetaInformation__Group__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup(), "rule__BusinessProcedure__Group__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_4(), "rule__BusinessProcedure__Group_4__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_5(), "rule__BusinessProcedure__Group_5__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_6(), "rule__BusinessProcedure__Group_6__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_7(), "rule__BusinessProcedure__Group_7__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_8(), "rule__BusinessProcedure__Group_8__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_9(), "rule__BusinessProcedure__Group_9__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_9_3(), "rule__BusinessProcedure__Group_9_3__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_10(), "rule__BusinessProcedure__Group_10__0");
					put(grammarAccess.getBusinessProcedureAccess().getGroup_10_3(), "rule__BusinessProcedure__Group_10_3__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getLinkAccess().getGroup_3(), "rule__Link__Group_3__0");
					put(grammarAccess.getLinkAccess().getGroup_4(), "rule__Link__Group_4__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
					put(grammarAccess.getPredicateAccess().getGroup_4(), "rule__Predicate__Group_4__0");
					put(grammarAccess.getElement_ImplAccess().getGroup(), "rule__Element_Impl__Group__0");
					put(grammarAccess.getElement_ImplAccess().getGroup_4(), "rule__Element_Impl__Group_4__0");
					put(grammarAccess.getElement_ImplAccess().getGroup_5(), "rule__Element_Impl__Group_5__0");
					put(grammarAccess.getElement_ImplAccess().getGroup_5_3(), "rule__Element_Impl__Group_5_3__0");
					put(grammarAccess.getElement_ImplAccess().getGroup_6(), "rule__Element_Impl__Group_6__0");
					put(grammarAccess.getElement_ImplAccess().getGroup_6_3(), "rule__Element_Impl__Group_6_3__0");
					put(grammarAccess.getInputConditionAccess().getGroup(), "rule__InputCondition__Group__0");
					put(grammarAccess.getInputConditionAccess().getGroup_4(), "rule__InputCondition__Group_4__0");
					put(grammarAccess.getInputConditionAccess().getGroup_5(), "rule__InputCondition__Group_5__0");
					put(grammarAccess.getInputConditionAccess().getGroup_5_3(), "rule__InputCondition__Group_5_3__0");
					put(grammarAccess.getInputConditionAccess().getGroup_6(), "rule__InputCondition__Group_6__0");
					put(grammarAccess.getInputConditionAccess().getGroup_6_3(), "rule__InputCondition__Group_6_3__0");
					put(grammarAccess.getOutputConditionAccess().getGroup(), "rule__OutputCondition__Group__0");
					put(grammarAccess.getOutputConditionAccess().getGroup_4(), "rule__OutputCondition__Group_4__0");
					put(grammarAccess.getOutputConditionAccess().getGroup_5(), "rule__OutputCondition__Group_5__0");
					put(grammarAccess.getOutputConditionAccess().getGroup_5_3(), "rule__OutputCondition__Group_5_3__0");
					put(grammarAccess.getOutputConditionAccess().getGroup_6(), "rule__OutputCondition__Group_6__0");
					put(grammarAccess.getOutputConditionAccess().getGroup_6_3(), "rule__OutputCondition__Group_6_3__0");
					put(grammarAccess.getCondition_ImplAccess().getGroup(), "rule__Condition_Impl__Group__0");
					put(grammarAccess.getCondition_ImplAccess().getGroup_4(), "rule__Condition_Impl__Group_4__0");
					put(grammarAccess.getCondition_ImplAccess().getGroup_5(), "rule__Condition_Impl__Group_5__0");
					put(grammarAccess.getCondition_ImplAccess().getGroup_5_3(), "rule__Condition_Impl__Group_5_3__0");
					put(grammarAccess.getCondition_ImplAccess().getGroup_6(), "rule__Condition_Impl__Group_6__0");
					put(grammarAccess.getCondition_ImplAccess().getGroup_6_3(), "rule__Condition_Impl__Group_6_3__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup(), "rule__Procedure_Impl__Group__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_4(), "rule__Procedure_Impl__Group_4__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_5(), "rule__Procedure_Impl__Group_5__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_6(), "rule__Procedure_Impl__Group_6__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_7(), "rule__Procedure_Impl__Group_7__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_8(), "rule__Procedure_Impl__Group_8__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_9(), "rule__Procedure_Impl__Group_9__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_9_3(), "rule__Procedure_Impl__Group_9_3__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_10(), "rule__Procedure_Impl__Group_10__0");
					put(grammarAccess.getProcedure_ImplAccess().getGroup_10_3(), "rule__Procedure_Impl__Group_10_3__0");
					put(grammarAccess.getForEachLoopAccess().getGroup(), "rule__ForEachLoop__Group__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_3(), "rule__ForEachLoop__Group_3__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_4(), "rule__ForEachLoop__Group_4__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_5(), "rule__ForEachLoop__Group_5__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_6(), "rule__ForEachLoop__Group_6__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_7(), "rule__ForEachLoop__Group_7__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_8(), "rule__ForEachLoop__Group_8__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_8_3(), "rule__ForEachLoop__Group_8_3__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_11(), "rule__ForEachLoop__Group_11__0");
					put(grammarAccess.getForEachLoopAccess().getGroup_11_3(), "rule__ForEachLoop__Group_11_3__0");
					put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_3(), "rule__WhileLoop__Group_3__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_4(), "rule__WhileLoop__Group_4__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_5(), "rule__WhileLoop__Group_5__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_6(), "rule__WhileLoop__Group_6__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_7(), "rule__WhileLoop__Group_7__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_8(), "rule__WhileLoop__Group_8__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_8_3(), "rule__WhileLoop__Group_8_3__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_11(), "rule__WhileLoop__Group_11__0");
					put(grammarAccess.getWhileLoopAccess().getGroup_11_3(), "rule__WhileLoop__Group_11_3__0");
					put(grammarAccess.getHandlerAccess().getGroup(), "rule__Handler__Group__0");
					put(grammarAccess.getHandlerAccess().getGroup_4(), "rule__Handler__Group_4__0");
					put(grammarAccess.getHandlerAccess().getGroup_5(), "rule__Handler__Group_5__0");
					put(grammarAccess.getHandlerAccess().getGroup_6(), "rule__Handler__Group_6__0");
					put(grammarAccess.getHandlerAccess().getGroup_7(), "rule__Handler__Group_7__0");
					put(grammarAccess.getHandlerAccess().getGroup_8(), "rule__Handler__Group_8__0");
					put(grammarAccess.getHandlerAccess().getGroup_9(), "rule__Handler__Group_9__0");
					put(grammarAccess.getHandlerAccess().getGroup_9_3(), "rule__Handler__Group_9_3__0");
					put(grammarAccess.getHandlerAccess().getGroup_10(), "rule__Handler__Group_10__0");
					put(grammarAccess.getHandlerAccess().getGroup_10_3(), "rule__Handler__Group_10_3__0");
					put(grammarAccess.getHandlerAccess().getGroup_11(), "rule__Handler__Group_11__0");
					put(grammarAccess.getHandlerAccess().getGroup_11_3(), "rule__Handler__Group_11_3__0");
					put(grammarAccess.getPipelineAccess().getGroup(), "rule__Pipeline__Group__0");
					put(grammarAccess.getPipelineAccess().getGroup_3(), "rule__Pipeline__Group_3__0");
					put(grammarAccess.getPipelineAccess().getGroup_4(), "rule__Pipeline__Group_4__0");
					put(grammarAccess.getPipelineAccess().getGroup_5(), "rule__Pipeline__Group_5__0");
					put(grammarAccess.getPipelineAccess().getGroup_6(), "rule__Pipeline__Group_6__0");
					put(grammarAccess.getPipelineAccess().getGroup_7(), "rule__Pipeline__Group_7__0");
					put(grammarAccess.getPipelineAccess().getGroup_8(), "rule__Pipeline__Group_8__0");
					put(grammarAccess.getPipelineAccess().getGroup_8_3(), "rule__Pipeline__Group_8_3__0");
					put(grammarAccess.getPipelineAccess().getGroup_11(), "rule__Pipeline__Group_11__0");
					put(grammarAccess.getPipelineAccess().getGroup_11_3(), "rule__Pipeline__Group_11_3__0");
					put(grammarAccess.getPipelineAccess().getGroup_12(), "rule__Pipeline__Group_12__0");
					put(grammarAccess.getPipelineAccess().getGroup_12_3(), "rule__Pipeline__Group_12_3__0");
					put(grammarAccess.getDataAccess().getGroup(), "rule__Data__Group__0");
					put(grammarAccess.getDataAccess().getGroup_4(), "rule__Data__Group_4__0");
					put(grammarAccess.getDataAccess().getGroup_5(), "rule__Data__Group_5__0");
					put(grammarAccess.getSpecificationAccess().getProgramsAssignment_1_0(), "rule__Specification__ProgramsAssignment_1_0");
					put(grammarAccess.getSpecificationAccess().getProgramsAssignment_1_1_1(), "rule__Specification__ProgramsAssignment_1_1_1");
					put(grammarAccess.getSpecificationAccess().getMetaInformationContainerAssignment_2_1(), "rule__Specification__MetaInformationContainerAssignment_2_1");
					put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
					put(grammarAccess.getProgramAccess().getDescriptionAssignment_3_1(), "rule__Program__DescriptionAssignment_3_1");
					put(grammarAccess.getProgramAccess().getCapacityAssignment_4_1(), "rule__Program__CapacityAssignment_4_1");
					put(grammarAccess.getProgramAccess().getInputConditionAssignment_6(), "rule__Program__InputConditionAssignment_6");
					put(grammarAccess.getProgramAccess().getOutputConditionAssignment_8(), "rule__Program__OutputConditionAssignment_8");
					put(grammarAccess.getProgramAccess().getPredicatesAssignment_9_2(), "rule__Program__PredicatesAssignment_9_2");
					put(grammarAccess.getProgramAccess().getPredicatesAssignment_9_3_1(), "rule__Program__PredicatesAssignment_9_3_1");
					put(grammarAccess.getProgramAccess().getElementsAssignment_10_0(), "rule__Program__ElementsAssignment_10_0");
					put(grammarAccess.getProgramAccess().getElementsAssignment_10_1_1(), "rule__Program__ElementsAssignment_10_1_1");
					put(grammarAccess.getProgramAccess().getDataAssignment_11_2(), "rule__Program__DataAssignment_11_2");
					put(grammarAccess.getProgramAccess().getDataAssignment_11_3_1(), "rule__Program__DataAssignment_11_3_1");
					put(grammarAccess.getMetaInformationContainerAccess().getMetaInformationAssignment_3_2(), "rule__MetaInformationContainer__MetaInformationAssignment_3_2");
					put(grammarAccess.getMetaInformationContainerAccess().getMetaInformationAssignment_3_3_1(), "rule__MetaInformationContainer__MetaInformationAssignment_3_3_1");
					put(grammarAccess.getBusinessProcedureAccess().getNameAssignment_2(), "rule__BusinessProcedure__NameAssignment_2");
					put(grammarAccess.getBusinessProcedureAccess().getDescriptionAssignment_4_1(), "rule__BusinessProcedure__DescriptionAssignment_4_1");
					put(grammarAccess.getBusinessProcedureAccess().getExecutableAssignment_5_1(), "rule__BusinessProcedure__ExecutableAssignment_5_1");
					put(grammarAccess.getBusinessProcedureAccess().getJoinAssignment_6_1(), "rule__BusinessProcedure__JoinAssignment_6_1");
					put(grammarAccess.getBusinessProcedureAccess().getSplitAssignment_7_1(), "rule__BusinessProcedure__SplitAssignment_7_1");
					put(grammarAccess.getBusinessProcedureAccess().getCapacityAssignment_8_1(), "rule__BusinessProcedure__CapacityAssignment_8_1");
					put(grammarAccess.getBusinessProcedureAccess().getInputLinksAssignment_9_2(), "rule__BusinessProcedure__InputLinksAssignment_9_2");
					put(grammarAccess.getBusinessProcedureAccess().getInputLinksAssignment_9_3_1(), "rule__BusinessProcedure__InputLinksAssignment_9_3_1");
					put(grammarAccess.getBusinessProcedureAccess().getOutputLinksAssignment_10_2(), "rule__BusinessProcedure__OutputLinksAssignment_10_2");
					put(grammarAccess.getBusinessProcedureAccess().getOutputLinksAssignment_10_3_1(), "rule__BusinessProcedure__OutputLinksAssignment_10_3_1");
					put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
					put(grammarAccess.getLinkAccess().getDescriptionAssignment_3_1(), "rule__Link__DescriptionAssignment_3_1");
					put(grammarAccess.getLinkAccess().getPredicateAssignment_4_1(), "rule__Link__PredicateAssignment_4_1");
					put(grammarAccess.getLinkAccess().getDestinationAssignment_6(), "rule__Link__DestinationAssignment_6");
					put(grammarAccess.getPredicateAccess().getNameAssignment_2(), "rule__Predicate__NameAssignment_2");
					put(grammarAccess.getPredicateAccess().getDescriptionAssignment_4_1(), "rule__Predicate__DescriptionAssignment_4_1");
					put(grammarAccess.getElement_ImplAccess().getNameAssignment_2(), "rule__Element_Impl__NameAssignment_2");
					put(grammarAccess.getElement_ImplAccess().getDescriptionAssignment_4_1(), "rule__Element_Impl__DescriptionAssignment_4_1");
					put(grammarAccess.getElement_ImplAccess().getInputLinksAssignment_5_2(), "rule__Element_Impl__InputLinksAssignment_5_2");
					put(grammarAccess.getElement_ImplAccess().getInputLinksAssignment_5_3_1(), "rule__Element_Impl__InputLinksAssignment_5_3_1");
					put(grammarAccess.getElement_ImplAccess().getOutputLinksAssignment_6_2(), "rule__Element_Impl__OutputLinksAssignment_6_2");
					put(grammarAccess.getElement_ImplAccess().getOutputLinksAssignment_6_3_1(), "rule__Element_Impl__OutputLinksAssignment_6_3_1");
					put(grammarAccess.getInputConditionAccess().getNameAssignment_2(), "rule__InputCondition__NameAssignment_2");
					put(grammarAccess.getInputConditionAccess().getDescriptionAssignment_4_1(), "rule__InputCondition__DescriptionAssignment_4_1");
					put(grammarAccess.getInputConditionAccess().getInputLinksAssignment_5_2(), "rule__InputCondition__InputLinksAssignment_5_2");
					put(grammarAccess.getInputConditionAccess().getInputLinksAssignment_5_3_1(), "rule__InputCondition__InputLinksAssignment_5_3_1");
					put(grammarAccess.getInputConditionAccess().getOutputLinksAssignment_6_2(), "rule__InputCondition__OutputLinksAssignment_6_2");
					put(grammarAccess.getInputConditionAccess().getOutputLinksAssignment_6_3_1(), "rule__InputCondition__OutputLinksAssignment_6_3_1");
					put(grammarAccess.getOutputConditionAccess().getNameAssignment_2(), "rule__OutputCondition__NameAssignment_2");
					put(grammarAccess.getOutputConditionAccess().getDescriptionAssignment_4_1(), "rule__OutputCondition__DescriptionAssignment_4_1");
					put(grammarAccess.getOutputConditionAccess().getInputLinksAssignment_5_2(), "rule__OutputCondition__InputLinksAssignment_5_2");
					put(grammarAccess.getOutputConditionAccess().getInputLinksAssignment_5_3_1(), "rule__OutputCondition__InputLinksAssignment_5_3_1");
					put(grammarAccess.getOutputConditionAccess().getOutputLinksAssignment_6_2(), "rule__OutputCondition__OutputLinksAssignment_6_2");
					put(grammarAccess.getOutputConditionAccess().getOutputLinksAssignment_6_3_1(), "rule__OutputCondition__OutputLinksAssignment_6_3_1");
					put(grammarAccess.getCondition_ImplAccess().getNameAssignment_2(), "rule__Condition_Impl__NameAssignment_2");
					put(grammarAccess.getCondition_ImplAccess().getDescriptionAssignment_4_1(), "rule__Condition_Impl__DescriptionAssignment_4_1");
					put(grammarAccess.getCondition_ImplAccess().getInputLinksAssignment_5_2(), "rule__Condition_Impl__InputLinksAssignment_5_2");
					put(grammarAccess.getCondition_ImplAccess().getInputLinksAssignment_5_3_1(), "rule__Condition_Impl__InputLinksAssignment_5_3_1");
					put(grammarAccess.getCondition_ImplAccess().getOutputLinksAssignment_6_2(), "rule__Condition_Impl__OutputLinksAssignment_6_2");
					put(grammarAccess.getCondition_ImplAccess().getOutputLinksAssignment_6_3_1(), "rule__Condition_Impl__OutputLinksAssignment_6_3_1");
					put(grammarAccess.getProcedure_ImplAccess().getNameAssignment_2(), "rule__Procedure_Impl__NameAssignment_2");
					put(grammarAccess.getProcedure_ImplAccess().getDescriptionAssignment_4_1(), "rule__Procedure_Impl__DescriptionAssignment_4_1");
					put(grammarAccess.getProcedure_ImplAccess().getExecutableAssignment_5_1(), "rule__Procedure_Impl__ExecutableAssignment_5_1");
					put(grammarAccess.getProcedure_ImplAccess().getJoinAssignment_6_1(), "rule__Procedure_Impl__JoinAssignment_6_1");
					put(grammarAccess.getProcedure_ImplAccess().getSplitAssignment_7_1(), "rule__Procedure_Impl__SplitAssignment_7_1");
					put(grammarAccess.getProcedure_ImplAccess().getCapacityAssignment_8_1(), "rule__Procedure_Impl__CapacityAssignment_8_1");
					put(grammarAccess.getProcedure_ImplAccess().getInputLinksAssignment_9_2(), "rule__Procedure_Impl__InputLinksAssignment_9_2");
					put(grammarAccess.getProcedure_ImplAccess().getInputLinksAssignment_9_3_1(), "rule__Procedure_Impl__InputLinksAssignment_9_3_1");
					put(grammarAccess.getProcedure_ImplAccess().getOutputLinksAssignment_10_2(), "rule__Procedure_Impl__OutputLinksAssignment_10_2");
					put(grammarAccess.getProcedure_ImplAccess().getOutputLinksAssignment_10_3_1(), "rule__Procedure_Impl__OutputLinksAssignment_10_3_1");
					put(grammarAccess.getForEachLoopAccess().getNameAssignment_1(), "rule__ForEachLoop__NameAssignment_1");
					put(grammarAccess.getForEachLoopAccess().getDescriptionAssignment_3_1(), "rule__ForEachLoop__DescriptionAssignment_3_1");
					put(grammarAccess.getForEachLoopAccess().getExecutableAssignment_4_1(), "rule__ForEachLoop__ExecutableAssignment_4_1");
					put(grammarAccess.getForEachLoopAccess().getJoinAssignment_5_1(), "rule__ForEachLoop__JoinAssignment_5_1");
					put(grammarAccess.getForEachLoopAccess().getSplitAssignment_6_1(), "rule__ForEachLoop__SplitAssignment_6_1");
					put(grammarAccess.getForEachLoopAccess().getCapacityAssignment_7_1(), "rule__ForEachLoop__CapacityAssignment_7_1");
					put(grammarAccess.getForEachLoopAccess().getInputLinksAssignment_8_2(), "rule__ForEachLoop__InputLinksAssignment_8_2");
					put(grammarAccess.getForEachLoopAccess().getInputLinksAssignment_8_3_1(), "rule__ForEachLoop__InputLinksAssignment_8_3_1");
					put(grammarAccess.getForEachLoopAccess().getIterableAssignment_10(), "rule__ForEachLoop__IterableAssignment_10");
					put(grammarAccess.getForEachLoopAccess().getOutputLinksAssignment_11_2(), "rule__ForEachLoop__OutputLinksAssignment_11_2");
					put(grammarAccess.getForEachLoopAccess().getOutputLinksAssignment_11_3_1(), "rule__ForEachLoop__OutputLinksAssignment_11_3_1");
					put(grammarAccess.getWhileLoopAccess().getNameAssignment_1(), "rule__WhileLoop__NameAssignment_1");
					put(grammarAccess.getWhileLoopAccess().getDescriptionAssignment_3_1(), "rule__WhileLoop__DescriptionAssignment_3_1");
					put(grammarAccess.getWhileLoopAccess().getExecutableAssignment_4_1(), "rule__WhileLoop__ExecutableAssignment_4_1");
					put(grammarAccess.getWhileLoopAccess().getJoinAssignment_5_1(), "rule__WhileLoop__JoinAssignment_5_1");
					put(grammarAccess.getWhileLoopAccess().getSplitAssignment_6_1(), "rule__WhileLoop__SplitAssignment_6_1");
					put(grammarAccess.getWhileLoopAccess().getCapacityAssignment_7_1(), "rule__WhileLoop__CapacityAssignment_7_1");
					put(grammarAccess.getWhileLoopAccess().getInputLinksAssignment_8_2(), "rule__WhileLoop__InputLinksAssignment_8_2");
					put(grammarAccess.getWhileLoopAccess().getInputLinksAssignment_8_3_1(), "rule__WhileLoop__InputLinksAssignment_8_3_1");
					put(grammarAccess.getWhileLoopAccess().getPredicateAssignment_10(), "rule__WhileLoop__PredicateAssignment_10");
					put(grammarAccess.getWhileLoopAccess().getOutputLinksAssignment_11_2(), "rule__WhileLoop__OutputLinksAssignment_11_2");
					put(grammarAccess.getWhileLoopAccess().getOutputLinksAssignment_11_3_1(), "rule__WhileLoop__OutputLinksAssignment_11_3_1");
					put(grammarAccess.getHandlerAccess().getNameAssignment_2(), "rule__Handler__NameAssignment_2");
					put(grammarAccess.getHandlerAccess().getDescriptionAssignment_4_1(), "rule__Handler__DescriptionAssignment_4_1");
					put(grammarAccess.getHandlerAccess().getExecutableAssignment_5_1(), "rule__Handler__ExecutableAssignment_5_1");
					put(grammarAccess.getHandlerAccess().getJoinAssignment_6_1(), "rule__Handler__JoinAssignment_6_1");
					put(grammarAccess.getHandlerAccess().getSplitAssignment_7_1(), "rule__Handler__SplitAssignment_7_1");
					put(grammarAccess.getHandlerAccess().getCapacityAssignment_8_1(), "rule__Handler__CapacityAssignment_8_1");
					put(grammarAccess.getHandlerAccess().getInputLinksAssignment_9_2(), "rule__Handler__InputLinksAssignment_9_2");
					put(grammarAccess.getHandlerAccess().getInputLinksAssignment_9_3_1(), "rule__Handler__InputLinksAssignment_9_3_1");
					put(grammarAccess.getHandlerAccess().getProceduresAssignment_10_2(), "rule__Handler__ProceduresAssignment_10_2");
					put(grammarAccess.getHandlerAccess().getProceduresAssignment_10_3_1(), "rule__Handler__ProceduresAssignment_10_3_1");
					put(grammarAccess.getHandlerAccess().getOutputLinksAssignment_11_2(), "rule__Handler__OutputLinksAssignment_11_2");
					put(grammarAccess.getHandlerAccess().getOutputLinksAssignment_11_3_1(), "rule__Handler__OutputLinksAssignment_11_3_1");
					put(grammarAccess.getPipelineAccess().getNameAssignment_1(), "rule__Pipeline__NameAssignment_1");
					put(grammarAccess.getPipelineAccess().getDescriptionAssignment_3_1(), "rule__Pipeline__DescriptionAssignment_3_1");
					put(grammarAccess.getPipelineAccess().getExecutableAssignment_4_1(), "rule__Pipeline__ExecutableAssignment_4_1");
					put(grammarAccess.getPipelineAccess().getJoinAssignment_5_1(), "rule__Pipeline__JoinAssignment_5_1");
					put(grammarAccess.getPipelineAccess().getSplitAssignment_6_1(), "rule__Pipeline__SplitAssignment_6_1");
					put(grammarAccess.getPipelineAccess().getCapacityAssignment_7_1(), "rule__Pipeline__CapacityAssignment_7_1");
					put(grammarAccess.getPipelineAccess().getInputLinksAssignment_8_2(), "rule__Pipeline__InputLinksAssignment_8_2");
					put(grammarAccess.getPipelineAccess().getInputLinksAssignment_8_3_1(), "rule__Pipeline__InputLinksAssignment_8_3_1");
					put(grammarAccess.getPipelineAccess().getIterableAssignment_10(), "rule__Pipeline__IterableAssignment_10");
					put(grammarAccess.getPipelineAccess().getOutputLinksAssignment_11_2(), "rule__Pipeline__OutputLinksAssignment_11_2");
					put(grammarAccess.getPipelineAccess().getOutputLinksAssignment_11_3_1(), "rule__Pipeline__OutputLinksAssignment_11_3_1");
					put(grammarAccess.getPipelineAccess().getProceduresAssignment_12_2(), "rule__Pipeline__ProceduresAssignment_12_2");
					put(grammarAccess.getPipelineAccess().getProceduresAssignment_12_3_1(), "rule__Pipeline__ProceduresAssignment_12_3_1");
					put(grammarAccess.getDataAccess().getNameAssignment_2(), "rule__Data__NameAssignment_2");
					put(grammarAccess.getDataAccess().getDescriptionAssignment_4_1(), "rule__Data__DescriptionAssignment_4_1");
					put(grammarAccess.getDataAccess().getTypeAssignment_5_1(), "rule__Data__TypeAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.parallelj.ui.contentassist.antlr.internal.InternalPjlParser typedParser = (org.parallelj.ui.contentassist.antlr.internal.InternalPjlParser) parser;
			typedParser.entryRuleSpecification();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PjlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PjlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
