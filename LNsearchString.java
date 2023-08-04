public class LNsearchString {
    public static int Lnsearch(String menu[],String key){
        for(int i = 0; i<menu.length ;i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"chicken","sandwich","samosha","burger","popcorn"};
        String key = "samosha";
        int position = Lnsearch(menu, key);
        if(position == -1){
            System.out.println("Menu Not Found!");
        }
        else{
            System.out.println("Menu Found At Position ="+" "+position);
        }
    }
}
