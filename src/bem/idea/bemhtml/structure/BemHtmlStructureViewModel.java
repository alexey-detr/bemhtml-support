package bem.idea.bemhtml.structure;

import bem.idea.bemhtml.lang.psi.impl.BemHtmlPsiFileImpl;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class BemHtmlStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {

    public BemHtmlStructureViewModel(final BemHtmlPsiFileImpl psiFile) {
        super(psiFile, new BemHtmlStructureViewElement(psiFile, null, null, true));
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }

    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return false;
    }
}
