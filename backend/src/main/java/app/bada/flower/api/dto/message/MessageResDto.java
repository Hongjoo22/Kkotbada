package app.bada.flower.api.dto.message;

import app.bada.flower.api.entity.Message;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class MessageResDto {

    @Getter
    public static class MessageDto {
        private int messageId;
        private int flowerId;
        private String imgUrl;
        private String content;
        private String writer;
        private String font;

        // Entity -> DTO
        public MessageDto(Message message) {
            this.messageId = message.getId();
            this.flowerId = message.getFlowerItem().getId();
            this.imgUrl = message.getFlowerItem().getImgUrl();
            this.content = message.getContent();
            this.writer = message.getWriter();
            this.font = message.getFont();
        }

        // QueryDSL에서 사용하는 생성자
        public MessageDto(int messageId, int flowerId, String imgUrl, String content, String writer, String font) {
            this.messageId = messageId;
            this.flowerId = flowerId;
            this.imgUrl = imgUrl;
            this.content = content;
            this.writer = writer;
            this.font = font;
        }
    }


    @Getter
    @Setter
    public static class rollingMsgDto {
        private int messageId;
        private int flowerId;
        private String writer;
        private String imgUrl;
    }

}
