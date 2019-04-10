export interface IBook {
    id?: number;
    name?: string;
    editorial?: string;
    toked?: boolean;
    person?: string;
}

export class Book implements IBook {
    constructor(public id?: number, public name?: string, public editorial?: string, public toked?: boolean, public person?: string) {
        this.toked = this.toked || false;
    }
}
