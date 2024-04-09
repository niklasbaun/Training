public class ex4_4 {
    public void testAll(){
        double[] coords = {-20.0, 0.0,200.0, -18.5, -0.647,200.577, -16.85, -1.237, 201.16, -15.035, -1.763,
                201.739, -13.038, -2.219, 202.299, -10.842, -2.599, 202.824, -8.426, -2.894,
                203.289, -5.769, -3.096, 203.667, -2.846, -3.195, 203.918, 0.369, -3.182,
                203.998, 3.861, -3.205, 203.85, 7.284, -3.176, 203.469, 10.638, -3.209,
                202.868, 13.926, -3.175, 202.06, 17.147, -3.209,201.059, 20, -3.174, 199.877};
        //distance test
        double distance1 = 3.4641016151377544;
        double distance1Res = distance(coords);
        if(distance1 == distance1Res){
            System.out.println("distance(coords1) = " + distance1Res + " PASSED");
        } else {
            System.out.println("distance(coords1) = " + distance1Res + " FAILED");
            System.out.println("Expected: " + distance1);
        }

        //velocity test
        double velocity1 = 1.1547005383792515;
        double velocity1Res = velocity(coords);
        if(velocity1 == velocity1Res){
            System.out.println("velocity(coords1) = " + velocity1Res + " PASSED");
        } else {
            System.out.println("velocity(coords1) = " + velocity1Res + " FAILED");
            System.out.println("Expected: " + velocity1);
        }

        //maxVelocity test
        double maxVelocity1 = 1.7320508075688772;
        double maxVelocity1Res = maxVelocity(coords);
        if(maxVelocity1 == maxVelocity1Res){
            System.out.println("maxVelocity(coords1) = " + maxVelocity1Res + " PASSED");
        } else {
            System.out.println("maxVelocity(coords1) = " + maxVelocity1Res + " FAILED");
            System.out.println("Expected: " + maxVelocity1);
        }

        //partial GPS test
        double[] start = {-20,0,200};
        double[] end = {-18.5,-0.647,200.577};
        double[] partialGPS1 = {-20,0,200, -18.5,-0.647,200.577};
        double[] partialGPS1Res = partialGPS(coords, start, end);
        if(partialGPS1.length == partialGPS1Res.length){
            boolean passed = true;
            for(int i = 0; i < partialGPS1.length; i++){
                if(partialGPS1[i] != partialGPS1Res[i]){
                    passed = false;
                }
            }
            if(passed){
                System.out.println("partialGPS(coords1, start, end) = " + partialGPS1Res + " PASSED");
            } else {
                System.out.println("partialGPS(coords1, start, end) = " + partialGPS1Res + " FAILED");
                System.out.println("Expected: " + partialGPS1);
            }
        } else {
            System.out.println("partialGPS(coords1, start, end) = " + partialGPS1Res + " FAILED");
            System.out.println("Expected: " + partialGPS1);
        }
    }

    private double distance(double[] coords){
        double[] start = {coords[0], coords[1], coords[2]};
        double[] end = {coords[coords.length - 3], coords[coords.length - 2], coords[coords.length -1]};

        return Math.sqrt(Math.pow(end[0] - start[0], 2) + Math.pow(end[1] - start[1], 2) + Math.pow(end[2] - start[2], 2));
    }

    private double velocity(double[] coords){
        return distance(coords) / coords.length/3;
    }

    private double maxVelocity(double[] coords){
        double max = 0;
        for(int i = 0; i < coords.length - 3; i += 3){
            double[] start = {coords[i], coords[i + 1], coords[i + 2]};
            double[] end = {coords[i + 3], coords[i + 4], coords[i + 5]};
            double distance = Math.sqrt(Math.pow(end[0] - start[0], 2) + Math.pow(end[1] - start[1], 2) + Math.pow(end[2] - start[2], 2));
            double velocity = distance / 3;
            if(velocity > max){
                max = velocity;
            }
        }
        return max;
    }

    private double[] partialGPS(double[] coords, double[] start,double[] end){
        //find start and end in coords
        int start_index = -1;
        int end_index = -1;
        for(int i = 0; i < coords.length - 3; i += 3){
            if(coords[i] == start[0] && coords[i + 1] == start[1] && coords[i + 2] == start[2]){
                start_index = i;
            }
            if(coords[i] == end[0] && coords[i + 1] == end[1] && coords[i + 2] == end[2]){
                end_index = i;
            }
        }
        if(start_index == -1 || end_index == -1){
            return new double[0];
        }
        double[] partial_coords = new double[end_index - start_index + 3];
        for(int i = start_index; i <= end_index; i++){
            partial_coords[i - start_index] = coords[i];
        }
        return partial_coords;
    }

    public static void main(String[] args) {
        ex4_4 ex = new ex4_4();
        ex.testAll();
    }
}