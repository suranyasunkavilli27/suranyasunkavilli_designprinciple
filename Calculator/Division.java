class Division{
    float first;
    float second;
    Division(float first, float second){
        this.first = first;
        this.second = second;
    }
    public float dividetwonumbers(float a, float b){
        float ans = 0;
        try{
            ans = (a/b)
        }
        catch{
            System.out.println("Arithmetic Exception");
        }
    }
}
