package inc.sh.simple.androidstudio.ideaplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by shiza on 02.01.14.
 */
public class SimplePluginGenerator  extends AnAction {

    public void actionPerformed(final AnActionEvent e) {
        SimplePluginForm dialog = new SimplePluginForm (getEventProject(e));
        dialog.show();
    }
}
