import BookItem from "./BookItem";

function BookDetails() {

    const books = [
        {
            id:1,
            name:"React in Action",
            author:"Mark Tielens"
        },
        {
            id:2,
            name:"Learning React",
            author:"Alex Banks"
        },
        {
            id:3,
            name:"Java Complete Reference",
            author:"Herbert Schildt"
        }
    ];

    return(
        <div className="card">
            <h2>Book Details</h2>

            <ul>
                {books.map((book)=>(
                    <BookItem
                        key={book.id}
                        book={book}
                    />
                ))}
            </ul>

        </div>
    );
}

export default BookDetails;