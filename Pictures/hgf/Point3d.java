package Lab1;

/**
 *
 * @author Pc
 */
class point3d {
     private double xCoord;
    private double yCoord;
    private double zCoord;
    public point3d(double x, double y, double z){
    xCoord = x;
    yCoord = y;
    zCoord = z;
    }
    public point3d(){
    this(0,0,0);
    }
    public double getX(){
    return xCoord;
    }
    public double getY(){
    return yCoord;
    }
    public double getZ(){
    return zCoord;
    }
    public void setX(double val){
    xCoord = val;
    }
    public void setY(double val){
    yCoord = val;
    }
    public void setZ(double val){
    zCoord = val;
    }
    public boolean equals(Object obj)
    {
    if (obj instanceof point3d)
    {
    point3d other = (point3d)obj;
    if (xCoord == other.getX() && yCoord == other.getY() &&  zCoord == other.getZ()) {return true;}
    }
    return false;
    }
    public double distance(point3d other)
    {
    if(other == null) {return -1;}
    double dist = 0;
    dist += Math.pow(xCoord - other.getX(), 2);
    dist += Math.pow(yCoord - other.getY(), 2);
    dist += Math.pow(zCoord - other.getZ(), 2);
    dist = Math.sqrt(dist);
   // System.out.print("   dist   " + dist);;
    return dist;
    }
}
