package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class AutoCompleteJComboBox extends JComboBox implements AutoCompleteSupport {

    private final List<Object> items;
    private final JTextField textField;
    private final DefaultComboBoxModel model;

    public AutoCompleteJComboBox() {
        items = new ArrayList<>();
        textField = (JTextField) getEditor().getEditorComponent();
        model = (DefaultComboBoxModel) getModel();

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = textField.getText().toLowerCase();
                updateModel(text);
            }
        });
    }

    private void updateModel(String text) {
        model.removeAllElements();
        for (Object item : items) {
            String s = item.toString().toLowerCase();
            if (s.contains(text)) {
                model.addElement(item);
            }
        }
        setSelectedItem(text);
        textField.setSelectionEnd(textField.getText().length());
        showPopup();
    }

    @Override
    public void setItems(List<Object> items) {
        this.items.clear();
        this.items.addAll(items);
        model.removeAllElements();
        for (Object item : items) {
            model.addElement(item);
        }
    }

    @Override
    public List<Object> getItems() {
        return new ArrayList<>(items);
    }
}

