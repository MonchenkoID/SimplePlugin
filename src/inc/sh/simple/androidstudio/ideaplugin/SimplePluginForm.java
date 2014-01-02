package inc.sh.simple.androidstudio.ideaplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by shiza on 02.01.14.
 */
public class SimplePluginForm extends DialogWrapper {

   // private static final int DEFAULT_BUFFER_SIZE = 1024 * 4;
   // public static final String IDEA_FOLDER = "/.idea";

    private JDialog loadingDialog;
  //  private Project project;
    private JPanel ahcPanel;
    private JProgressBar progressBar;

    public SimplePluginForm(@Nullable final Project project) {
        super(project, true);

        loadingDialog = new JDialog(getWindow(), "Downloading, please wait...", Dialog.ModalityType.MODELESS);
        loadingDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        loadingDialog.setSize(300, 20);
        loadingDialog.setLocationRelativeTo(ahcPanel);

     //   this.project = project;

        progressBar.setIndeterminate(true);
        for(int i=0;i<100;i++)
        {
            progressBar.setValue(i);
        }

        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return ahcPanel;
    }

}
