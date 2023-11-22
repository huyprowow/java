public class TxtFile{
    private String filename;
    private String data;

    public String getName() {
        return filename;
    }

    public void setName(String newName) {
        if(newName!=null){

        this.filename = newName;
        }else{
            System.out.println("file name is null");
        }
    }

    public String getData() {

        return data;
    }

    public void setData(String newData) {
        if(newData!=null){
            this.data = newData;

        }else{
            System.out.println("text name is null");
        }
    }
    public void appendData(String newData){
        this.data+=newData;
    }

    public TxtFile(String name, String text) {
        if(name!=null||text!=null) {

            this.filename = name;
            this.data = text;
        }else{
            System.out.println("name or text is null");
        }
    }

    public static void main(String[] args) {
        TxtFile test = new TxtFile("foo", "bar");
//now check whether the name prints correctly.
        System.out.println(test.getName());
//now try to set the name differently
        test.setName("newname");
//look to see if the value is correct or not
        System.out.println(test.getName());
//test getData() and setData() similarly

    }
}
