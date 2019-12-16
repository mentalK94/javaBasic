package view;

import model.Bear;
import model.Fish;
import model.GameObject;

public class OutputViewImpl implements OutputView {

	@Override
	public void loadingMessageView() {
		System.out.println("Bear�� Fish�Ա� ���� �ε���...");
	}

	@Override
	public void startMessageView() {
		System.out.println("***** Bear�� Fish�Ա� ������ �����մϴ� *****");
	}

	@Override
	public void gameBoardView(String[][] gameBoard, Fish fish, Bear bear) {
				
		initGameBoard(gameBoard);
		drawGameObject(gameBoard, fish);
		drawGameObject(gameBoard, bear);
		
		// view GameBoard
		for(int i=0; i<gameBoard[i].length; i++) {
			for(int j=0; j<gameBoard.length; j++) {
				System.out.print(gameBoard[j][i]);
			}
			System.out.println();
		}
	}

	@Override
	public void initGameBoard(String[][] gameBoard) {
		for(int i=0; i<gameBoard[i].length; i++) {
			for(int j=0; j<gameBoard.length; j++) {
				gameBoard[j][i] = "-";
			}			
		}
	}

	@Override
	public void winMessageView() {
		System.out.println("Bear�� �̰���ϴ�.");
	}

	@Override
	public void drawGameObject(String[][] gameBoard, GameObject gameObject) {		
		gameBoard[gameObject.getX()][gameObject.getY()] = gameObject.getShape();
	}

	@Override
	public void locationLogger(int x, int y) {
		System.out.println("x : "+x+", y : "+y);
		
	}
}
