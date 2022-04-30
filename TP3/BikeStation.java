


public class BikeStation {

    // DEFINIR LES ATTRIBIUTS
    private String name;
		private int capacity;
		private Bike[] bikes;

    /** Creates a Bike station wich has a name, a capacity and can host BikeStation
		 * Intially there are not bikes int the station
		 *@param name the name of the bike BikeStation
		 *@param capacity the numbers of bikes that can contains the station
     *
     */
	public BikeStation(String name, int capacity) {
	    this.name = name;
			this.capacity = capacity;
      this.bikes = new  Bike[capacity];
	}

    /**Returns the name of the station
     * @return the name of this station
     */
	public String getName() {
	    // TODO
		return this.name;
	}

    /** Returns the capacity of bikes that the station can contains
     * @return the the capacity of this station
     */
	public int getCapacity() {
	    // TODO
		return this.capacity;
	}

    /** Returns the numbers of bikes of the station
     * @return the number of bikes that this station contains
     */
	public int getNumberOfBikes() {
		int cpt = 0;
	  for (Bike bike : this.bikes){
			if (bike == null)
			    continue;
			else
			   cpt++;
		}
		return cpt;
	}


    /**Returns the smallest index of slot avalaible in the station or -1 if there is not
		 * free slot
     * @return the smallest index that don't contains a bike or -1 if there is not slot avalaible
     */
	public int firstFreeSlot() {
	    for (int i=0;i<this.bikes.length ; i++){
				if (this.bikes[i] == null)
				   return i;
				else
				   continue;
			}
		return -1;
	}

    /**Allows to deposit a bike in the station
		 *If there is free slot in the station it deposits the bike and returns true
		 *returns false else
     *@param bike the bike to deposit
		 @return true if the bike has been registred , false else
     */
	public boolean dropBike(Bike bike) {
		  int slot = this.firstFreeSlot();
	    if (slot != -1){
				this.bikes[slot] = bike;
				return true;
			}
			else
			  return false;
	}



    /**Allows to take a bike.
		 * If there is a bike in the asked the slot , it returns the bike , returns null else
     * @param i the position of the bike in the station
		 *@return the bike situed at the position i, or null if the paramater is invalid or there if not bike at the position
     */
	public Bike takeBike(int i) {
		  if (i< 0 || i>= this.bikes.length || this.bikes[i] == null) return null;



    Bike temps = this.bikes[i] ;
    this.bikes[i] = null;
    return temps;

	}


}
