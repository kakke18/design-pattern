package chapter12_Decorator;

import java.util.ArrayList;

public class MultiDisplay extends Display {
    private ArrayList body = new ArrayList();
    private int maxColumnCount = 0;

    public void add(String msg) {
        this.body.add(msg);
        updateMaxColumn(msg);
    }

    @Override
    public int getColumns() {
        return maxColumnCount;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return (String)body.get(row);
    }

    private void updateMaxColumn(String msg) {
        // 最大値を更新
        if (msg.getBytes().length > maxColumnCount) {
            maxColumnCount = msg.getBytes().length;
        }
        // 各行の空白を更新
        for (int row = 0; row < body.size(); row++) {
            int fills = maxColumnCount - ((String)body.get(row)).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }

    private String spaces(int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}
