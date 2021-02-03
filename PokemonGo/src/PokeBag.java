import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    // pokemon 이름과 pokemonList 를 가지는 HashMap 선언
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        // pokemons 의 key 에 name 이 들어 있는지 확인
        for (String key : pokemons.keySet()) {
            // name 이 들어있으면 pokemonList 를 return
            if (key.equals(name)) {
                return pokemons.get(key);
            }
        }
        return null;
    }

    public void add(Pokemon pokemon) {
        // pokemons 에 넣을 pokemon 이 이미 들어 있는지 확인
        if (getPokemons(pokemon.name) == null) {
            // 없다면 새로운 pokemonList 를 만들어서 pokemon 을 넣어주고 pokemons 에 넣어준다.
            ArrayList<Pokemon> newArrayList = new ArrayList<>();
            newArrayList.add(pokemon);
            pokemons.put(pokemon.name, newArrayList);
        } else {  // 있다면 그냥 pokemonList 에 pokemon 만 넣어준다.
            pokemons.get(pokemon.name).add(pokemon);
        }
    }

    public Pokemon getStrongest(String name) {
        // 찾을 pokemon 이 pokemons 에 있는지 먼저 확인
        for (String key : pokemons.keySet()) {
            // 있는 경우
            if (key.equals(name)) {
                // 해당하는 이름의 pokemonList 를 가져온다.
                ArrayList<Pokemon> pokemonList = pokemons.get(key);

                int maxCpIndex = 0;
                int maxCp = pokemonList.get(0).cp;

                // 가장 높은 cp를 가진 pokemon 을 찾는다.
                for (int i=0;i<pokemonList.size();i++) {
                    if (pokemonList.get(i).cp > maxCp) {
                        maxCp = pokemonList.get(i).cp;
                        maxCpIndex = i;
                    }
                }
                return pokemonList.get(maxCpIndex);
            }
        }
        // 없는 경우
        return null;
    }

    public Pokemon getStrongest() {
        // 이름별 가장 센 pokemon을 담을 리스트 선언
        ArrayList<Pokemon> strongPokemons = new ArrayList<>();

        // 모든 pokemon 탐색하면서 가장 센 pokemon 담기
        for (String key : pokemons.keySet()) {
            strongPokemons.add(getStrongest(key));
        }

        int maxCpIndex = 0;
        int maxCp = strongPokemons.get(0).cp;

        // 가장 높은 cp를 가진 pokemon 을 찾는다.
        for (int i=0; i<strongPokemons.size(); i++) {
            if (strongPokemons.get(i).cp > maxCp) {
                maxCp = strongPokemons.get(i).cp;
                maxCpIndex = i;
            }
        }
        return strongPokemons.get(maxCpIndex);
    }
}