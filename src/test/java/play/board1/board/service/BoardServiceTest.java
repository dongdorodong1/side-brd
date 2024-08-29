package play.board1.board.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import play.board1.board.dto.BoardDto;
import play.board1.board.entity.Board;
import play.board1.board.repository.BoardCommentRepository;
import play.board1.board.repository.BoardJpaRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BoardServiceTest {

    private BoardJpaRepository boardJpaRepository;
    private BoardCommentRepository commentRepository;
    @Test
    public void paging() {
        //given

        int age = 10;
        PageRequest pageRequest = PageRequest.of(0, 3, Sort.by(Sort.Direction.DESC, "username"));

        //when
//        Page<Board> page = boardJpaRepository.findByAge(age, pageRequest);
//        Slice<Member> page = memberRepository.findByAge(age, pageRequest);
//        Page<BoardDto> toMap = page.map(board -> new BoardDto(board.getId(), board.getUsername(), null));

        //then
//        List<Member> content = page.getContent();

//        assertThat(content.size()).isEqualTo(3);
//        assertThat(page.getTotalElements()).isEqualTo(5);
//        assertThat(page.getNumber()).isEqualTo(0);
//        assertThat(page.getTotalPages()).isEqualTo(2);
//        assertThat(page.isFirst()).isTrue();
//        assertThat(page.hasNext()).isTrue();
    }
}