package bem.idea.bemhtml.structure;

import bem.idea.bemhtml.lang.psi.BemHtmlPsiFile;
import bem.idea.bemhtml.lang.psi.impl.BemHtmlPsiFileImpl;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.newStructureView.StructureViewComponent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.project.Project;

public class BemHtmlStructureViewComponent extends StructureViewComponent {

    private final BemHtmlPsiFile myFile;

    public BemHtmlStructureViewComponent(FileEditor editor, BemHtmlPsiFileImpl psiFile, Project project, boolean showRootNode) {
        super(editor, new BemHtmlStructureViewModel(psiFile), project, showRootNode);
        myFile = psiFile;
    }

    @Override
    public Object getData(String dataId) {
        if (CommonDataKeys.PSI_ELEMENT.is(dataId)) {
            return myFile;
        }
        return super.getData(dataId);
    }
}
