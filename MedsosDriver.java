package medsos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Lenovo
 */
public class MedsosDriver {
    public static void main(String args[]){
        ArrayList<Medsos> google = new ArrayList<>();
        google.add(new Medsos("Muhammad Risvi K.A","Laki-Laki","06-05-97","M Risvi K A","siiboydjokam354@gmail.com","354","Teman"));
        google.add(new Medsos("Tomi Dwi Prasetyo","Laki-Laki","05-07-1998","Tomi dp","tomidwiprasetyo@gmail.com","123","Teman"));
        google.add(new Medsos("Ach Rizal Yogaswara","Laki-Laki","04-05-1778","Ach Rizal","rizalyogxs@gmail.com","234","Teman"));
        google.add(new Medsos("Namaku","gender","tgllahir","id","xxx@gmail.com","354","Teman"));
        
        System.out.println("Nama\t\t\tJenis Kelamin\t\temail");
        for(int i = 0; i<google.size(); i++)
            System.out.println(google.get(i).getNama()+"\t"+google.get(i).getJenisKelamin()+"\t"+google.get(i).getEmail());
        
        Collections.sort(google);
        System.out.println("Setelah Sorting");
        google.stream().forEach(buku -> System.out.println(buku.getNama()));
        
        HashMap<String, ArrayList> goo = new HashMap<String, ArrayList>();
        goo.put("Teman", google);
        
        boolean n = goo.containsKey("Teman");
        int i = 0;
        for(n = true; i<google.size(); i++)
            System.out.println(google.get(i).getNama()+" "+google.get(i).getJenisKelamin());
        
        
    }
}
