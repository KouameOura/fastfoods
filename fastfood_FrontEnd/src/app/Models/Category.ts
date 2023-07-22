import { Branch } from './Branch';
import { SubCategory } from './SubCategory';

export class Category{
    categoryId : number;
    categoryName:string;
    subCategories:SubCategory[];
    branch: Branch;
}