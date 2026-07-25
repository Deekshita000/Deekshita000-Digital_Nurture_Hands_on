import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: [
                new Post(0, 0, "", "")
            ]
        };
    }

    loadPosts = () => {

        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {
                this.setState({
                    posts: data
                });
            })
            .catch(error => {
                throw error;
            });
    };

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert("Error : " + error);
        console.log(info);
    }

    render() {

        return (

            <div style={{ margin: "20px" }}>

                <h1>Posts</h1>

                {
                    this.state.posts.map(post => (

                        <div
                            key={post.id}
                            style={{
                                border: "1px solid gray",
                                marginBottom: "15px",
                                padding: "10px",
                                borderRadius: "5px"
                            }}
                        >

                            <h3>{post.title}</h3>

                            <p>{post.body}</p>

                        </div>

                    ))
                }

            </div>

        );
    }
}

export default Posts;