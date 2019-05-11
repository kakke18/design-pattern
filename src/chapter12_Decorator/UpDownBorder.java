package chapter12_Decorator;

public class UpDownBorder extends Border {
    private char borderChar;
    public UpDownBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        // 枠の上端 or 下端
        if (row == 0 || row == display.getRows() + 1) {
            return makeLine(borderChar, display.getColumns());
        }
        // それ以外
        return display.getRowText(row - 1);
    }

    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
