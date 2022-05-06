package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

public class VisualizacaoTableModel extends AbstractTableModel {
    private String[] colunas = { "1", "2", "3" };
    private Object[][] linhas = {
            { "CI1068", "CI1210", "CI1212" },
            { "CI1055", "CI1056", "CI1057" },
            { "CI1003", "CI1001", "CI1002" },
            { "CMA111", "CMA211", "CI1237" },
            { "CM304", "CM303", "CE009" },
    };

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public int getRowCount() {
        return this.linhas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return "a";
            case 1:
                return "b";
            case 2:
                return "c";
        }
        return null;
    }
}
