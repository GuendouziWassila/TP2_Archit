package Class;

import Interface.IJournal;

import java.util.ArrayList;
import java.util.List;

public class AfficherComposite implements IJournal {

    private List<IJournal> children;

    public AfficherComposite() {
        this.children = new ArrayList<>();
    }

    @Override
    public void outPut_Msg(String message) {
        for (IJournal child: children) {
            child.outPut_Msg(message);
        }
    }

    public void add(IJournal child) {
        children.add(child);
    }

    public void remove(IJournal child) {
        children.remove(child);
    }
}
