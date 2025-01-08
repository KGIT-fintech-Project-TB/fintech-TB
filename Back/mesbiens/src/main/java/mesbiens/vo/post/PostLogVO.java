package mesbiens.vo.post;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@SequenceGenerator(
			name="postLog_no_seq_postLogNo", // 시퀀스 제너레이터 이름
			sequenceName = "postLog_no_seq", // 시퀀스 이름
			initialValue = 1, // 시작값
			allocationSize = 1 // 증감값
		)
@Table(name="postLog")
@EqualsAndHashCode(of="postLogNo")

public class PostLogVO {

	
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, // 사용할 전략을 시퀀스로 선택
			generator = "postLog_no_seq_postLogNo" // 시퀀스 생성기에 설정해 놓은 제너레이터 이름
		)
	private Number postLogNo;
	
	/* userVO 외래키 (userVO 작성전까지 주석처리)
	@ManyToOne // 다대일 관계 설정
	@JoinColumn(name = "UserId", nullable = false) // 외래키 매핑
	// name = "UserId": Post 테이블에서 외래키 컬럼 이름.
	// nullable = false: 이 컬럼이 반드시 값이 있어야 함을 지정.
	private UserVO user; // 회원 ID(글쓴이)
	*/
	
	private String postLogType; // 로그 유형
	
	
	
	@CreationTimestamp // 이 애노테이션은 글 등록시점의 날짜와 시간값을 기록한다.
	private Timestamp postLogDate; // 로그 생성 시각
	
	private String postDeletedData; // 게시판 삭제 여부
	private String postDeletedCommentData; // 댓글 삭제 여부
	
}