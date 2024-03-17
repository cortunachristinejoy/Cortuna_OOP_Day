public class Main {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter initial text: ");
            String initialText = scanner.nextLine();
            
            System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
            int editorType = scanner.nextInt();
            
            TextEditor editor;
            if (editorType == 1) {
                editor = new PrintTextEditor(initialText);
            } else {
                editor = new AdvancedTextEditor(initialText);
            }
            
            System.out.print("Enter code: ");
            int code = scanner.nextInt();
            
            if (code == 1) {
                System.out.println("SUCCESS");
            } else {
                if (editorType == 1) {
                    ((PrintTextEditor) editor).print();
                } else {
                    editor.append("\nNew Text");
                    System.out.println(editor.getText());
                    System.out.println("SUCCESS");
                }
            }
        }
    }
}
