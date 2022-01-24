package com.groupware.planet;

import com.groupware.planet.cobti.entity.CobtiAnswerType;
import com.groupware.planet.cobti.entity.CobtiAnswerTypeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class PlanetApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    CobtiAnswerTypeRepository cobtiAnswerTypeRepository;

    @Test
    public void InsertDummies() {
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("E").id(1).answer("중앙부에 위치한 푹신한 소파").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("I").id(1).answer("조용한 창가의 바테이블").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("T").id(2).answer("부드러운 칵테일과 함께 그 날 있었던 일들을 조목조목 이야기한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("F").id(2).answer("오늘일은 잊어버려! 도수 높은 칵테일을 마시고 진탕 취한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("S").id(3).answer("\"칵테일바 완전 존예!\" 간단하게 이야기한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("N").id(3).answer("\"조명은 은은하고,, 소파는 푹신거리고,,\" 자세하게 설명한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("S").id(4).answer("\"넘나 맛있는 것 !\" 단순하게 설명한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("N").id(4).answer("\"그 칵테일은 말이야,, 상큼한 맛이 나면서<br>톡톡 쏘고 ,,\"구체적으로 설명한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("J").id(5).answer("블로그와 후기를 꼼꼼하게 비교하여 결정한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("P").id(5).answer("길을 가다가 분위기가 좋아보이는 곳에 들어간다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("E").id(6).answer("여럿이서 놀아야 재밌지 ! 여럿이서 만난다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("I").id(6).answer("시끄러운 건 싫어! 둘이서 만난다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("T").id(7).answer("현실적인 조언과 해결방안을 제시해주는게 좋다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("F").id(7).answer("\"ㅠㅠ 많이 힘들었겠다 ..\"<br>공감해주는게 좋다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("J").id(8).answer("\"그거 왼쪽 서랍 세 번째 칸에 있어\" 정확히 알고 있다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("P").id(8).answer("\"음 .. 책상 쪽 한번 잘 봐봐\" 대충 느낌으로 안다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("T").id(9).answer("집에 돌아가서 해야할 일을 생각한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("F").id(9).answer("오늘 있었던 일을 생각하며 피식 웃는다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("E").id(10).answer("역시 회의는 얼굴보고 해야지. 화상회의를 켜서 진행한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("I").id(10).answer("텍스트로도 전달할 수 있는데 굳이? 전체톡방에서 회의한다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("J").id(11).answer("챙겨야 할 짐의 체크리스트를 만들어 확인하며 챙긴다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("P").id(11).answer("여행 전날, 급하게 생각나는대로 챙긴다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("S").id(12).answer("\"어느 건물에서 어느 방향으로 몇미터 ...\" 상세하게 알려준다.").build());
        cobtiAnswerTypeRepository.save(CobtiAnswerType.builder().type("N").id(12).answer("주위에 있는 큰 건물들을 위주로 알려준다.").build());
    }
}