package edu.monmouth.employee;

public class PieceEmployee implements Employee{
	private int ratePerPiece;
	private int piecesMade;
	
	public PieceEmployee(int ratePerPiece) {
		this.ratePerPiece = ratePerPiece;
	}
	
	public boolean equals(Employee object) {
		if(object.getMonthlyPay() == (ratePerPiece * piecesMade)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setPiecesMade(int piecesMade) {
		
	}
	
	@Override
	public int getMonthlyPay() {
		return (ratePerPiece * piecesMade);
	}
	
	public String toString() {
		return  "" +
				"\nPiece Employee " +
				"\nRate Per Piece = " + ratePerPiece +
				"\nPieces Made = " + piecesMade +
				"\nMonthly Pay = " + getMonthlyPay(); 
	}

}
