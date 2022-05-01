package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

public class VisualizacaoTableModel extends AbstractTableModel {
    private String[] colunas = new String[] { "1", "2", "3", "4", "5", "6", "7", "8" };
    private String[] lin1 = new String[] { "CI1068", "CI1210", "CI1212", "CI1059", "CI1065", "CI1209", "CI1221",
            "CI1211" };
    private String[] lin2 = new String[] { "CI1055", "CI1056", "CI1057", "CI1350", "CI1058", "CI1218", "CI1007",
            "CI1005" };
    private String[] lin3 = new String[] { "CI1003", "CI1001", "CI1002", "CI1165", "CI1238", "CI1061", "OPT", "OPT" };
    private String[] lin4 = new String[] { "CMA111", "CMA211", "CI1237", "CI1164", "CI1162", "CI1316", "OPT", "OPT" };
    private String[] lin5 = new String[] { "CM304", "CM303", "CE009", "CI1062", "CI1215", "CI1163", "TCC I", "TCC II" };
    private String[] lin6 = new String[] { "", "", "", "CI1064", "OPT", "OPT", "OPT", "CI1100", "" };
    private List<String[]> codigos = new ArrayList<String[]>();

    private void adicionacodigos() {
        this.codigos.add(lin1);
        this.codigos.add(lin2);
        this.codigos.add(lin3);
        this.codigos.add(lin4);
        this.codigos.add(lin5);
        this.codigos.add(lin6);
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public int getRowCount() {
        return this.codigos.size();
    }

    @Override
	public Object getValueAt(int linha, int coluna) {
		adicionacodigos();
		switch(coluna) {
		case 0:
			return this.codigos.get(linha).get???;
		case 1:
			return this.codigos.get(linha);
		}
		case 2:
			return this.codigos.get(linha).get???;
		case 3:
			return this.codigos.get(linha).get???;
		case 4:
			return this.codigos.get(linha).get???;
		case 5:
			return this.codigos.get(linha).get???;
		case 6:
			return this.codigos.get(linha).get???;
		case 7:
			return this.codigos.get(linha).get???;
		case 8:
			return this.codigos.get(linha).get???;		
		
	}
}
