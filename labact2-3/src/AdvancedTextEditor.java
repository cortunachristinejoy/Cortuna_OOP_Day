class AdvancedTextEditor extends TextEditor {
    private String previousText;

    public AdvancedTextEditor(String initialText) {
        super(initialText);
        this.previousText = initialText;
    }

    @Override
    public void append(String newText) {
        super.append(newText);
        previousText = getText();
    }

    @Override
    public void delete(int n) {
        super.delete(n);
        previousText = getText();
    }

    @Override
    public void undo() {
        setText(previousText);
    }

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}