import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
      <div className="container">
        <h1>Blogger Application</h1>

        {/* Conditional Rendering using && */}
        {showBooks && <BookDetails />}

        {/* Conditional Rendering using Ternary */}
        {showBlogs ? <BlogDetails /> : <h3>No Blogs Available</h3>}

        {/* Conditional Rendering using if-else inside component */}
        {showCourses && <CourseDetails />}
      </div>
  );
}

export default App;