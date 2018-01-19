import { CustomSchedule } from "./CustomSchedule";
import { WorkSchedule } from "./WorkSchedule";
import { Person } from "./Person";

export class User {
    userId: number;
    username: string;
    password: string;
    cs: CustomSchedule;
    ws: WorkSchedule;
    person: Person;
}