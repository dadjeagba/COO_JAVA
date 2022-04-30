package pfc;

public enum Shape {

	ROCK, PAPER, SCISSORS;

	/**
	 * compares 2 shapes
	 *
	 * @return true iff this beats c
	 */
	public boolean beats(Shape c) {
      int cmp = this.compareTo(c) ;
      if (cmp == 2) cmp = -1 ;
      if (cmp == -2) cmp = 1 ;
      return cmp > 0 ;
	}


}
