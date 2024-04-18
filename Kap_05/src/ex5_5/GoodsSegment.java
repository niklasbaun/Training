package ex5_5;

public class GoodsSegment {
    public double height;
    public double width;
    public double depth;
    public double maxWeight;
    //a segment has 9 compartments with each a 3rd of the width and depth
    public GoodsCrate[] compartments;

    /**
     * constructor of GoodsSegment
     * @param height the height of the segment
     * @param width the width of the segment
     * @param depth the depth of the segment
     * @param maxWeight the weight of the segment
     */
    public GoodsSegment(double height, double width, double depth, double maxWeight) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.maxWeight = maxWeight;
        this.compartments = new GoodsCrate[9];
    }

    /**
     * method to add a crate to the depot
     *      1. check if a compartment is empty
     *      2. check if total weight of crates in the segment is less than the maxWeight
     *      3. check if the crate fits into the compartment
     *      4. if all checks are passed add the crate to the compartment
     * @param crate the crate to add
     * @return true if the crate was added; false if not
     */

    public void addCrate(GoodsCrate crate){
        //if nothing is inputted
        if(crate == null){
            System.out.println("No crate was inputted");
            return;
        }
        //check if a compartment is empty
        int emptyCompartment = hasEmpty();
        if(emptyCompartment == -1){
            System.out.println("No empty compartment");
            return;
        }
        //check if total weight of crates in the segment is less than the maxWeight and if weight of crate will exceed it
        if(getTotalWeight() + crate.weight > maxWeight){
            System.out.println("Total weight of crates in the segment is too high");
            return;
        }
        //try to fit the crate in a compartment
        if(crateFits(crate)){
            //add crate to compartment
            compartments[emptyCompartment] = crate;
            System.out.println("Crate was added to compartment " + emptyCompartment);
        }
        else{
            System.out.println("Crate does not fit in compartment");
        }
    }

    /**
     * method to check if a compartment is empty and which one
     * @return the compartment number if empty; -1 if not
     */
    public int hasEmpty(){
        int i = 0;
        for(GoodsCrate crate : compartments){
            if(crate == null){
                return i;
            }
            i++;
        }
        return -1;
    }

    /**
     * method to get the total weight of all crates in the segment
     * @return the total weight of all crates in the segment
     */
    public double getTotalWeight(){
        double totalWeight = 0;
        for(GoodsCrate crate : compartments){
            if(crate != null){
                totalWeight += crate.weight;
            }
        }
        return totalWeight;
    }

    /**
     * method to check if a crate fits into the compartment
     * @param crate to check
     * @return true if fits; false if not
     */
    public boolean crateFits(GoodsCrate crate){
        //create vars for the compartment
        double compartmentHeight = height/3;
        double compartmentWidth = width/3;
        if((crate.height > compartmentHeight && crate.width > compartmentWidth && crate.depth > depth)||
                (crate.height > compartmentHeight && crate.width > depth && crate.depth > compartmentWidth) ||
                (crate.height > compartmentWidth && crate.width > compartmentHeight && crate.depth > depth) ||
                (crate.height > compartmentWidth && crate.width > depth && crate.depth > compartmentHeight) ||
                (crate.height > depth && crate.width > compartmentHeight && crate.depth > compartmentWidth) ||
                (crate.height > depth && crate.width > compartmentWidth && crate.depth > compartmentHeight)){

            return false;
        }
        return true;
    }

    /**
     * method to find a crate in the segment
     * @param crate the crate to find
     */
    public int findCrate(GoodsCrate crate){
        int i = 0;
        for(GoodsCrate crateInSegment : compartments){
            if(crateInSegment == crate){
                return i;
            }
            i++;
        }
        return -1;
    }
}
