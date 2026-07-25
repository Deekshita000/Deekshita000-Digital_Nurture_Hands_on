import BlogItem from "./BlogItem";

function BlogDetails(){

    const blogs=[
        {
            id:1,
            title:"React Basics",
            description:"Introduction to React."
        },
        {
            id:2,
            title:"Conditional Rendering",
            description:"Learn different rendering techniques."
        },
        {
            id:3,
            title:"React Hooks",
            description:"Understanding useState and useEffect."
        }
    ];

    let blogList;

    // Element Variable

    if(blogs.length>0){
        blogList=(
            <ul>
                {blogs.map((blog)=>(
                    <BlogItem
                        key={blog.id}
                        blog={blog}
                    />
                ))}
            </ul>
        );
    }
    else{
        blogList=<h3>No Blogs Found</h3>;
    }

    return(
        <div className="card">
            <h2>Blog Details</h2>

            {blogList}

        </div>
    );

}

export default BlogDetails;