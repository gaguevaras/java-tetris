package co.cz.tetris.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {
	
	JLabel statusBar;
	
	public Tetris(){
		
		statusBar = new JLabel(" 0");
		add(statusBar, BorderLayout.SOUTH);
		Board board = new Board(this);
		add(board);
		board.start();
		
		setSize(200, 400);
		setTitle("Guevara Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public JLabel getStatusBar(){
		return statusBar;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tetris game = new Tetris();
		game.setLocationRelativeTo(null);
		game.setVisible(true);

	}

}
