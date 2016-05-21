// Generated from D:/IntelliJ/COMP/grammar\DSLParser.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DSLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DSLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DSLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DSLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(DSLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(DSLParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(DSLParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(DSLParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(DSLParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(DSLParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(DSLParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(DSLParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(DSLParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(DSLParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(DSLParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(DSLParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(DSLParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(DSLParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(DSLParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(DSLParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(DSLParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(DSLParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(DSLParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(DSLParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(DSLParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(DSLParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(DSLParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(DSLParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(DSLParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(DSLParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(DSLParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(DSLParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(DSLParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(DSLParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(DSLParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(DSLParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(DSLParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(DSLParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(DSLParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(DSLParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(DSLParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(DSLParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(DSLParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(DSLParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(DSLParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(DSLParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(DSLParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(DSLParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(DSLParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(DSLParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(DSLParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(DSLParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(DSLParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(DSLParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(DSLParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(DSLParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(DSLParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(DSLParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(DSLParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(DSLParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(DSLParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(DSLParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(DSLParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(DSLParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(DSLParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(DSLParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(DSLParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(DSLParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(DSLParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(DSLParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(DSLParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(DSLParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(DSLParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(DSLParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(DSLParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(DSLParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(DSLParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(DSLParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(DSLParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(DSLParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(DSLParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(DSLParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(DSLParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(DSLParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(DSLParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(DSLParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(DSLParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(DSLParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(DSLParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(DSLParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(DSLParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(DSLParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(DSLParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(DSLParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(DSLParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(DSLParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(DSLParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(DSLParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DSLParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DSLParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(DSLParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(DSLParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(DSLParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(DSLParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(DSLParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(DSLParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(DSLParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(DSLParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(DSLParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(DSLParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(DSLParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(DSLParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(DSLParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(DSLParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(DSLParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(DSLParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(DSLParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(DSLParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(DSLParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(DSLParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(DSLParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(DSLParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(DSLParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(DSLParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(DSLParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(DSLParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(DSLParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(DSLParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(DSLParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(DSLParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(DSLParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(DSLParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(DSLParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(DSLParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(DSLParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(DSLParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(DSLParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(DSLParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(DSLParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(DSLParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(DSLParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(DSLParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(DSLParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(DSLParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(DSLParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(DSLParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(DSLParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(DSLParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(DSLParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(DSLParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(DSLParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(DSLParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(DSLParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(DSLParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(DSLParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(DSLParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(DSLParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(DSLParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(DSLParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(DSLParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(DSLParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(DSLParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(DSLParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(DSLParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(DSLParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(DSLParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(DSLParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(DSLParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(DSLParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(DSLParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(DSLParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(DSLParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(DSLParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(DSLParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(DSLParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(DSLParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(DSLParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(DSLParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(DSLParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(DSLParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(DSLParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(DSLParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(DSLParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(DSLParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(DSLParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(DSLParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(DSLParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(DSLParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(DSLParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(DSLParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(DSLParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(DSLParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(DSLParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(DSLParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(DSLParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(DSLParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(DSLParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(DSLParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(DSLParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(DSLParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(DSLParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(DSLParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(DSLParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(DSLParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(DSLParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(DSLParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(DSLParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(DSLParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(DSLParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(DSLParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(DSLParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(DSLParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(DSLParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(DSLParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(DSLParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(DSLParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(DSLParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(DSLParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(DSLParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(DSLParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(DSLParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(DSLParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(DSLParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(DSLParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(DSLParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(DSLParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(DSLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(DSLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(DSLParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(DSLParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(DSLParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(DSLParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(DSLParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(DSLParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(DSLParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(DSLParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(DSLParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(DSLParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(DSLParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(DSLParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(DSLParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(DSLParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(DSLParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(DSLParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(DSLParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(DSLParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(DSLParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(DSLParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(DSLParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(DSLParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DSLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DSLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(DSLParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(DSLParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(DSLParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(DSLParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(DSLParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(DSLParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(DSLParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(DSLParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(DSLParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(DSLParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(DSLParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(DSLParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(DSLParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(DSLParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(DSLParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(DSLParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(DSLParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(DSLParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(DSLParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(DSLParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(DSLParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(DSLParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(DSLParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(DSLParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(DSLParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(DSLParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(DSLParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(DSLParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(DSLParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(DSLParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(DSLParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(DSLParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(DSLParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(DSLParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(DSLParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(DSLParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(DSLParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(DSLParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(DSLParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(DSLParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(DSLParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(DSLParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(DSLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(DSLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(DSLParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(DSLParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(DSLParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(DSLParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(DSLParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(DSLParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(DSLParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(DSLParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(DSLParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(DSLParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(DSLParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(DSLParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(DSLParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(DSLParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(DSLParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(DSLParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(DSLParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(DSLParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(DSLParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(DSLParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(DSLParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(DSLParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(DSLParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(DSLParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(DSLParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(DSLParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(DSLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(DSLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(DSLParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(DSLParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(DSLParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(DSLParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(DSLParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(DSLParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(DSLParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(DSLParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(DSLParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(DSLParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(DSLParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(DSLParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(DSLParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(DSLParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(DSLParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(DSLParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(DSLParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(DSLParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(DSLParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(DSLParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(DSLParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(DSLParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(DSLParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(DSLParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DSLParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DSLParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(DSLParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(DSLParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(DSLParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(DSLParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(DSLParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(DSLParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(DSLParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(DSLParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(DSLParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(DSLParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(DSLParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(DSLParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(DSLParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(DSLParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(DSLParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(DSLParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(DSLParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(DSLParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(DSLParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(DSLParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(DSLParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(DSLParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(DSLParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(DSLParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(DSLParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(DSLParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(DSLParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(DSLParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(DSLParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(DSLParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(DSLParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(DSLParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(DSLParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(DSLParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(DSLParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(DSLParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(DSLParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(DSLParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(DSLParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(DSLParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(DSLParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(DSLParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(DSLParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(DSLParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(DSLParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(DSLParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(DSLParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(DSLParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(DSLParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(DSLParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(DSLParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(DSLParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(DSLParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(DSLParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DSLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DSLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(DSLParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(DSLParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(DSLParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(DSLParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(DSLParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(DSLParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(DSLParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(DSLParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(DSLParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(DSLParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DSLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DSLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(DSLParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(DSLParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(DSLParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(DSLParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(DSLParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(DSLParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(DSLParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(DSLParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(DSLParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(DSLParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(DSLParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(DSLParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(DSLParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(DSLParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(DSLParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(DSLParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(DSLParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(DSLParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(DSLParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(DSLParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(DSLParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(DSLParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(DSLParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(DSLParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(DSLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(DSLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(DSLParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(DSLParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(DSLParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(DSLParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(DSLParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(DSLParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(DSLParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(DSLParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(DSLParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(DSLParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(DSLParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(DSLParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(DSLParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(DSLParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(DSLParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(DSLParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(DSLParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(DSLParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(DSLParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(DSLParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#dsl}.
	 * @param ctx the parse tree
	 */
	void enterDsl(DSLParser.DslContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#dsl}.
	 * @param ctx the parse tree
	 */
	void exitDsl(DSLParser.DslContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(DSLParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(DSLParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DSLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DSLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#complexOperation}.
	 * @param ctx the parse tree
	 */
	void enterComplexOperation(DSLParser.ComplexOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#complexOperation}.
	 * @param ctx the parse tree
	 */
	void exitComplexOperation(DSLParser.ComplexOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#simpleOperation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleOperation(DSLParser.SimpleOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#simpleOperation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleOperation(DSLParser.SimpleOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#leftSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftSide(DSLParser.LeftSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#leftSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftSide(DSLParser.LeftSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DSLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DSLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#rightSide}.
	 * @param ctx the parse tree
	 */
	void enterRightSide(DSLParser.RightSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#rightSide}.
	 * @param ctx the parse tree
	 */
	void exitRightSide(DSLParser.RightSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#dslAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDslAssignment(DSLParser.DslAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#dslAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDslAssignment(DSLParser.DslAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DSLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DSLParser.PrintContext ctx);
}