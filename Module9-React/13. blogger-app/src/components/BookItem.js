function BookItem(props) {
    return (
        <li>
            <b>{props.book.name}</b> - {props.book.author}
        </li>
    );
}

export default BookItem;