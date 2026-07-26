import styles from "./CohortDetails.module.css";

function CohortDetails(props) {

    const cohort = props.cohort;

    return (

        <div className={styles.box}>

            <h3
                style={{
                    color:
                        cohort.status === "ongoing"
                            ? "green"
                            : "blue"
                }}
            >
                {cohort.name}
            </h3>

            <dl>

                <dt>Status</dt>
                <dd>{cohort.status}</dd>

                <dt>Coach</dt>
                <dd>{cohort.coach}</dd>

                <dt>Trainer</dt>
                <dd>{cohort.trainer}</dd>

                <dt>Start Date</dt>
                <dd>{cohort.startDate}</dd>

                <dt>Current Week</dt>
                <dd>{cohort.currentWeek}</dd>

            </dl>

        </div>

    );

}

export default CohortDetails;