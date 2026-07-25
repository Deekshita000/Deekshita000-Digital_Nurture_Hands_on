function BlogItem(props){

    return(
        <li>
            <b>{props.blog.title}</b><br/>
            {props.blog.description}
        </li>
    );
}

export default BlogItem;