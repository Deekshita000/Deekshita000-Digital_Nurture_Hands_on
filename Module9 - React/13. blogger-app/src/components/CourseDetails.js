import CourseItem from "./CourseItem";

function CourseDetails(){

    const courses=[
        {
            id:1,
            name:"React",
            duration:"2 Months"
        },
        {
            id:2,
            name:"Angular",
            duration:"3 Months"
        },
        {
            id:3,
            name:"Java Full Stack",
            duration:"6 Months"
        }
    ];

    // if else conditional rendering

    if(courses.length===0){
        return(
            <div className="card">
                <h2>No Courses Available</h2>
            </div>
        );
    }

    return(

        <div className="card">

            <h2>Course Details</h2>

            <ul>

                {courses.map((course)=>(
                    <CourseItem
                        key={course.id}
                        course={course}
                    />
                ))}

            </ul>

        </div>

    );

}

export default CourseDetails;