package one.digitalinnovation;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        /*List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Wolks"));
        listaCarros.add(new Carro("Pegeout"));

        
        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Wolks").hashCode());
        System.out.println(new Carro("Pegeout").hashCode());


        System.out.println(new Carro("d").hashCode());


        Carro carro1 = new Carro("Ford");

        Carro carro2 = new Carro("Ford");

        System.out.println(carro1.equals(carro2));

        Stack<Carro> stackCarros = new Stack<>();

        /*stackCarros.push(new Carro("wolkss1"));
        stackCarros.push(new Carro("wolkss2"));
        stackCarros.push(new Carro("wolkss3"));

        stackCarros.pop();
        stackCarros.pop();
        stackCarros.pop();
        System.out.println(stackCarros.isEmpty());
        System.out.println(stackCarros.peek());

        System.out.println(stackCarros);

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("teste1"));
        queueCarros.add(new Carro("teste2"));
        queueCarros.add(new Carro("teste3"));
        queueCarros.add(new Carro("teste4"));

        System.out.println(queueCarros.add(new Carro("teste5")));

        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("teste6")));
        
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());

        System.out.println(queueCarros.poll());

        System.out.println(queueCarros);
        

        List<Carro> listCarros = new ArrayList<>();
            

            listCarros.add(new Carro("teste1"));
            listCarros.add(new Carro("teste2"));
            listCarros.add(new Carro("teste3"));
            listCarros.add(new Carro("teste4"));
            listCarros.add(new Carro("teste5"));

            System.out.println(listCarros.contains(new Carro("teste1")));
            System.out.println(listCarros.get(3));

            System.out.println(listCarros.indexOf(new Carro("teste4")));

            System.out.println(listCarros.remove(3));

            System.out.println(listCarros);
            

            Set<Carro> hashSetcarros = new HashSet<>();

            hashSetcarros.add(new Carro("teste1"));
            hashSetcarros.add(new Carro("teste2"));
            hashSetcarros.add(new Carro("teste3"));
            hashSetcarros.add(new Carro("teste4"));
            hashSetcarros.add(new Carro("teste5"));
            hashSetcarros.add(new Carro("teste6"));

            System.out.println(hashSetcarros);
            
            Set<Carro> treeSetCarros = new TreeSet<>();

            treeSetCarros.add(new Carro("teste1"));
            treeSetCarros.add(new Carro("lesbora"));
            treeSetCarros.add(new Carro("bartolomeu"));
            treeSetCarros.add(new Carro("xorizo"));
            treeSetCarros.add(new Carro("capacete"));
            treeSetCarros.add(new Carro("testando"));

            System.out.println(treeSetCarros);
            

            Map<String, String> pessoa = new HashMap<>();

            pessoa.put("Nome", "Ary");
            pessoa.put("Idade", "21");
            pessoa.put("Status", "Casado");

            System.out.println(pessoa);

            System.out.println(pessoa.keySet());

            System.out.println(pessoa.values());

            */

            Map<String, String> pessoa1 = new HashMap<>();
            Map<String, String> pessoa2 = new HashMap<>();
            Map<String, String> pessoa3 = new HashMap<>();

            List<Map<String, String>> listaPessoas = new ArrayList<>();

            pessoa1.put("Nome","Ary");
            pessoa1.put("Idade", "21");
            pessoa1.put("Status", "Casado");

            pessoa2.put("Nome", "Lais");
            pessoa2.put("Idade", "22");
            pessoa2.put("Status", "Casado");

            pessoa3.put("Nome", "Cris");
            pessoa3.put("Idade", "32");
            pessoa3.put("Status", "Casado");

            listaPessoas.add(pessoa1);
            listaPessoas.add(pessoa2);
            listaPessoas.add(pessoa3);

            System.out.println(listaPessoas);

            System.out.println(pessoa1.containsKey("Nome"));
    }

}
