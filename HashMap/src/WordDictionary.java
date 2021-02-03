import java.util.HashMap;

public class WordDictionary {
    // 영어와 한국어를 저장하는 HahMap dictionary 선언
    HashMap<String, String> dictionary = new HashMap<>();

    public void addWord(String english, String korean) {
        // 대소문자 구분을 위해서 영어 단어는 대문자로 바꿔서 저장
        dictionary.put(english.toUpperCase(), korean);
    }

    public String find(String english) {
        // 사전에 들어있는 영어와 비교하기 위해 대문자로 바꿔준다.
        String upperWord = english.toUpperCase();
        String koreanWord = "";

        // key(영어) 가져오기
        for (String key : dictionary.keySet()) {
            // 비교해서 있으면 value(한국어) 가져오기
            if (upperWord.equals(key)) {
                koreanWord = dictionary.get(key);
            }
        }
        return koreanWord;
    }
}
