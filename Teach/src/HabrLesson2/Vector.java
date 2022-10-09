package HabrLesson2;

public class Vector {
    private double x,y,z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double VectorLenght(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double VectorScalerMultiply(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector VectorMultiply(Vector vector){
        return new Vector(y * vector.z - z * vector.y,z * vector.x - x * vector.z,x * vector.y - vector.x * y);
    }

    public double cosAngle(Vector vector){
        return ((VectorScalerMultiply(vector)) / (VectorLenght()) * vector.VectorLenght());
    }

    public Vector sumVector(Vector vector){
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector difVector(Vector vector){
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z

        );
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i = 0; i < vectors.length; i++){
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }

    @Override
    public String toString(){
        return "Vetor {x = " + x + " y = " + y + " z = " + z + "}";
    }

}
