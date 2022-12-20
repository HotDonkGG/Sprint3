import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(title, post.title) && Objects.equals(content, post.content) && Arrays.equals(tags, post.tags) && Objects.equals(comments, post.comments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, content, comments);
        result = 31 * result + Arrays.hashCode(tags);
        return result;
    }

    @Override
    public String toString() {
        if (content != null) {
            return "Post{" +
                    "title='" + title + '\'' +
                    ", content.length='" + content.length() + '\'' +
                    ", tags=" + Arrays.toString(tags) +
                    ", comments=" + comments +
                    '}';
        } else {
            return "Post{" +
                    "title='" + title + '\'' +
                    ", content='" + content + '\'' + // null
                    ", tags=" + Arrays.toString(tags) +
                    ", comments=" + comments +
                    '}';
        }
    }
}











  /* if( != null) {
        результат = результат + ", content.length='" + длина_контента + '\'';
    } else {
        result = результат + ", content='" + контент + '\'';
    } */

    /* Вывод должен получиться таким:
Post{title='xxx', content.length='x', tags=[x,x],
comments=[PostComment{text='x!', whoLiked=[x, x]},
PostComment{text='x', whoLiked=[x,x]},
PostComment{text='x', whoLiked=null}]} */

