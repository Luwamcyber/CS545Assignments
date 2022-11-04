package assignment1.post.controller;

import assignment1.post.domain.Post;
import assignment1.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable long id){
        return postService.getPost(id);
    }

    @PostMapping
    public String savePost(@RequestBody Post post){
        return postService.savePost(post);
    }

    @PutMapping("/{id}")
    public String updatePost(@RequestBody Post post , @PathVariable long id){
        return postService.updatePost(post, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable long id){
        return postService.deletePost(id);
    }
}
