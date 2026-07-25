function CourseItem(props){

    return(
        <li>
            <b>{props.course.name}</b> - {props.course.duration}
        </li>
    );

}

export default CourseItem;