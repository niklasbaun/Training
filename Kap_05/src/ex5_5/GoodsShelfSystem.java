package ex5_5;

public class GoodsShelfSystem {
    public GoodsSegment[] Shelf;

    /**
     * constructor of GoodsShelfSystem
     */
    public GoodsShelfSystem() {
        //create 5 segments
        this.Shelf = new GoodsSegment[5];
        this.Shelf[0] = new GoodsSegment(12.6, 21.3, 24.9, 100);
        this.Shelf[1] = new GoodsSegment(24.9, 18.3, 15.6, 150);
        this.Shelf[2] = new GoodsSegment(21.9, 18.3, 30.66, 200);
        this.Shelf[3] = new GoodsSegment(24.36, 27.63, 18.93, 400);
        this.Shelf[4] = new GoodsSegment(12.3, 15.93, 27.36, 360);
    }

    /**
     * method to add a crate to the shelf in the best fitting compartment
     * 1. check all shelfs
     * 2. check if crate fits in compartment and other requirements are met
     * 3. compare what fits better
     */
    public boolean findSegmentForCrate(GoodsCrate crate) {
        if (crate == null) {
            System.out.println("No crate was inputted");
            return false;
        }
        //create temporary segment for comparison
        int bestSegment = -1;
        GoodsSegment temp = null;
        //check all segments
        for (int i = 0; i < this.Shelf.length; i++) {
            //check if crate fits in compartment and other requirements are met
            if ((this.Shelf[i].hasEmpty() >= 0) && (this.Shelf[i].getTotalWeight() + crate.weight <= this.Shelf[i].maxWeight) && (this.Shelf[i].crateFits(crate))) {
                //if temp is not set
                if (temp != null) {
                    //if current segment fits better then temp segment
                    if ((this.Shelf[i].width < temp.width) || (this.Shelf[i].depth < temp.depth)|| (this.Shelf[i].height < temp.height)) {
                        bestSegment = i;
                        temp = this.Shelf[i];
                    }
                    //set initial temp segment
                }else {
                    bestSegment = i;
                    temp = this.Shelf[i];
                }
            }
        }
        //add current temp
        if(temp != null){
            System.out.println("Crate was added to segment " + bestSegment);
            temp.addCrate(crate);
            return true;
        }
        //nothing found
        else{
            System.out.println("No fitting segment found");
            return false;
        }
    }

    /**
     * find a crate in the shelf
     *              1. check all shelfs
     *              2. check if crate is in compartment
     *              3. if crate is found return the segment and compartment
     *              4. if crate is not found return null
     * @param crate the crate to find
     * @return the segment and compartment where the crate is
     */
    public int[] findCrate(GoodsCrate crate){
        if(crate == null){
            System.out.println("No crate was inputted");
            return null;
        }
        //check all segments
        for(int i = 0; i < this.Shelf.length; i++){
            //check if crate is in compartment
            int compartment = this.Shelf[i].findCrate(crate);
            if(compartment != -1){
                //crate is found
                int[] result = {i, compartment};
                return result;
            }
        }
        //crate is not found
        return null;
    }
}
