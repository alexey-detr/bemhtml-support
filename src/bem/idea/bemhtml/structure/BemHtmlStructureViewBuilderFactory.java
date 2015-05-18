package bem.idea.bemhtml.structure;

import bem.idea.bemhtml.lang.psi.BemHtmlElement;
import bem.idea.bemhtml.lang.psi.impl.BemHtmlPsiFileImpl;
import com.intellij.ide.structureView.StructureView;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BemHtmlStructureViewBuilderFactory implements PsiStructureViewFactory {
    public StructureViewBuilder getStructureViewBuilder(final PsiFile psiFile) {
        if (!(psiFile instanceof BemHtmlElement)) return null;
        return new TreeBasedStructureViewBuilder() {
            @NotNull
            @Override
            public StructureView createStructureView(FileEditor fileEditor, @NotNull Project project) {
                return new BemHtmlStructureViewComponent(fileEditor, (BemHtmlPsiFileImpl)psiFile, project, false);
            }
        };
    }
}
