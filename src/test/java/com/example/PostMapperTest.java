package com.example;

import com.example.board.domain.post.PostMapper;
import com.example.board.domain.post.PostRequest;
import com.example.board.domain.post.PostResponse;
import com.example.domain.post.PostMapper;
import com.example.domain.post.PostRequest;
import com.example.domain.post.PostResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostMapperTest {

    @Autowired
    PostMapper postMapper;

    @Test
    void save() {
        PostRequest params = new PostRequest();
        params.setTitle("1�� �Խñ� ����");
        params.setContent("1�� �Խñ� ����");
        params.setWriter("�׽���");
        params.setNoticeYn(false);
        postMapper.save(params);

        List<PostResponse> posts = postMapper.findAll();
        System.out.println("��ü �Խñ� ������ : " + posts.size() + "���Դϴ�.");
    }

}