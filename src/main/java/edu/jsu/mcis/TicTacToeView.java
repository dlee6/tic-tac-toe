package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        int width = model.getWidth();
        /* INSERT YOUR CODE HERE */
		System.out.print("\n  ");
		for(int i = 0; i < width; i++) {
			System.out.print(i);
		}
		System.out.print("\n\n");
		
		for(int j = 0; j < width; j++) {
                    System.out.print(j + " ");
                    for(int k = 0; k < width; k++) {
                        System.out.print(model.getMark(j, k));       
                    }
                    System.out.print("\n"); 
		}
                
		System.out.print("\n\n\n");
    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */
        if(model.isXTurn()) {
			System.out.println("Player 1(X) Move: ");
		}
		else {
			System.out.println("Player 2(O) Move: ");
		}
		System.out.print("Enter the row and column numbers, separated by a space: ");
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
		System.out.println("Error! Invalid Input! Please choose location within board!");
		

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}