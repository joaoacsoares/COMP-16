// Generated from D:/IntelliJ/COMP/grammar\DSLParser.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DSLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DSLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DSLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DSLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(DSLParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(DSLParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(DSLParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(DSLParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(DSLParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(DSLParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(DSLParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(DSLParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(DSLParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(DSLParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(DSLParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(DSLParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(DSLParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(DSLParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(DSLParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(DSLParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(DSLParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(DSLParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(DSLParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(DSLParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(DSLParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(DSLParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(DSLParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(DSLParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(DSLParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(DSLParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(DSLParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(DSLParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(DSLParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(DSLParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(DSLParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(DSLParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(DSLParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(DSLParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(DSLParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(DSLParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(DSLParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(DSLParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(DSLParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DSLParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(DSLParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(DSLParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(DSLParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(DSLParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(DSLParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(DSLParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(DSLParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DSLParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(DSLParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(DSLParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(DSLParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(DSLParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(DSLParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(DSLParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(DSLParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(DSLParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(DSLParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(DSLParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(DSLParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(DSLParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(DSLParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(DSLParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(DSLParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(DSLParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(DSLParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(DSLParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(DSLParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(DSLParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(DSLParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(DSLParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(DSLParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(DSLParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(DSLParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(DSLParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(DSLParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(DSLParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(DSLParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(DSLParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(DSLParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(DSLParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(DSLParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(DSLParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(DSLParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(DSLParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(DSLParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(DSLParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(DSLParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(DSLParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(DSLParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(DSLParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(DSLParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(DSLParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(DSLParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(DSLParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(DSLParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(DSLParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(DSLParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(DSLParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(DSLParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(DSLParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(DSLParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(DSLParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(DSLParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(DSLParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(DSLParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(DSLParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(DSLParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(DSLParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(DSLParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(DSLParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(DSLParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(DSLParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(DSLParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(DSLParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(DSLParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(DSLParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(DSLParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(DSLParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(DSLParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(DSLParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(DSLParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(DSLParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(DSLParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DSLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(DSLParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(DSLParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(DSLParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(DSLParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(DSLParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(DSLParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(DSLParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(DSLParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(DSLParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(DSLParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(DSLParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(DSLParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(DSLParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(DSLParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(DSLParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(DSLParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(DSLParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(DSLParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(DSLParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(DSLParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(DSLParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DSLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(DSLParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(DSLParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DSLParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(DSLParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(DSLParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(DSLParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(DSLParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(DSLParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(DSLParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(DSLParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(DSLParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(DSLParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(DSLParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(DSLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(DSLParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(DSLParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(DSLParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(DSLParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(DSLParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(DSLParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(DSLParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(DSLParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(DSLParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(DSLParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(DSLParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(DSLParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DSLParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(DSLParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(DSLParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(DSLParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(DSLParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(DSLParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(DSLParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(DSLParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(DSLParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(DSLParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(DSLParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(DSLParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(DSLParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(DSLParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(DSLParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(DSLParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(DSLParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(DSLParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(DSLParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(DSLParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(DSLParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(DSLParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(DSLParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(DSLParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(DSLParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(DSLParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(DSLParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(DSLParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(DSLParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DSLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(DSLParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(DSLParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(DSLParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(DSLParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(DSLParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DSLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(DSLParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(DSLParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DSLParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(DSLParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(DSLParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(DSLParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(DSLParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(DSLParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(DSLParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(DSLParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(DSLParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(DSLParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(DSLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DSLParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(DSLParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(DSLParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(DSLParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(DSLParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(DSLParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(DSLParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(DSLParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(DSLParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(DSLParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#dsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl(DSLParser.DslContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(DSLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DSLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#complexOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexOperation(DSLParser.ComplexOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#simpleOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleOperation(DSLParser.SimpleOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#leftSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftSide(DSLParser.LeftSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(DSLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#rightSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightSide(DSLParser.RightSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#dslAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDslAssignment(DSLParser.DslAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DSLParser.PrintContext ctx);
}